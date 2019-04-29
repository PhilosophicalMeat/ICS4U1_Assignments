//imports
import javax.swing.*;
import javax.swing.plaf.TextUI;
import javax.swing.text.JTextComponent;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class SwingSurvey{
    public static void main(String[] args) throws IOException {
        DefaultListModel listModel = new DefaultListModel();
        //stuff for printing to textdoc
        PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\Ethan\\Desktop\\SwingSurveyDoc.txt"));
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));
        frame.add(content);
        //adding scroll bar
        JScrollPane scroll = new JScrollPane(content, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scroll);
        //preset format for values
        NumberFormat format = NumberFormat.getInstance();
        //average number formatter
        NumberFormatter studentAverageFormatter = new NumberFormatter(format);
        studentAverageFormatter.setMaximum(100);
        studentAverageFormatter.setMinimum(0);
        studentAverageFormatter.setAllowsInvalid(false);

        //Student grade
        JLabel studentGradeLabel = new JLabel("Enter the students grade");
        studentGradeLabel.setSize(100,50);
        ButtonGroup studentGradeButtonGroup = new ButtonGroup();
        JRadioButton studentGradeA = new JRadioButton("A (80%-100%)");
        studentGradeA.setActionCommand("A");
        JRadioButton studentGradeB = new JRadioButton("B (70%-79%)");
        studentGradeB.setActionCommand("B");
        JRadioButton studentGradeC = new JRadioButton("C (60%-69%)");
        studentGradeC.setActionCommand("C");
        JRadioButton studentGradeD = new JRadioButton("D (50%-59%)");
        studentGradeD.setActionCommand("D");
        JRadioButton studentGradeF = new JRadioButton("F (0%-49%)");
        studentGradeF.setActionCommand("F");
        studentGradeButtonGroup.add(studentGradeA);
        studentGradeButtonGroup.add(studentGradeB);
        studentGradeButtonGroup.add(studentGradeD);
        studentGradeButtonGroup.add(studentGradeC);
        studentGradeButtonGroup.add(studentGradeF);

        //student age
        JLabel studentGenderLabel = new JLabel("Select the student's gender");
        studentGenderLabel.setSize(100,50);
        JRadioButton studentMale = new JRadioButton("Male");
        studentMale.setActionCommand("Male");
        JRadioButton studentFemale = new JRadioButton("Female");
        studentFemale.setActionCommand("Female");
        JRadioButton studentOther = new JRadioButton("Other");
        studentOther.setActionCommand("Other");
        ButtonGroup studentGenderButtonGroup = new ButtonGroup();
        studentGenderButtonGroup.add(studentMale);
        studentGenderButtonGroup.add(studentFemale);
        studentGenderButtonGroup.add(studentOther);

        //student age
        JLabel studentAgeLabel = new JLabel("Enter the student's age");
        studentAgeLabel.setSize(100,50);
        JSpinner studentAgeSpinner = new JSpinner(new SpinnerNumberModel(0,0,100,1));

        //student classes first semester
        JLabel studentClassesFirstSemesterLabel = new JLabel("Select the number of classes the student has first semester");
        JSpinner studentClassesFirstSemesterSpinner = new JSpinner(new SpinnerNumberModel(0,0,5,1));

        //student classes second semester
        JLabel studentClassesSecondSemesterLabel = new JLabel("Select the number of classes the student has second semester");
        JSpinner studentClassesSecondSemesterSpinner = new JSpinner(new SpinnerNumberModel(0,0,5,1));
        studentClassesSecondSemesterSpinner.setSize(25,25);

        //student average last year
        JLabel studentAverageLastYearLabel = new JLabel("Select the students average last year");
        JFormattedTextField studentAverageLastYearTextField = new JFormattedTextField(studentAverageFormatter);
        studentAverageLastYearTextField.setEditable(true);

        //student anticipated average
        JLabel studentAnticipatedAverageLabel = new JLabel("Enter the student's anticipated average this year");
        JFormattedTextField studentAnticipatedAverageTextField = new JFormattedTextField(studentAverageFormatter);
        studentAnticipatedAverageTextField.setEditable(true);

        //student clubs and activities
        JLabel clubsAndActiviesLabel = new JLabel("Enter the clubs and/ or teams the student is involved with");
        JList clubsList = new JList(listModel);
        clubsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JTextField clubTextField = new JTextField();
        JButton addClubToListButton = new JButton("Submit to the list of acivities");
        JLabel outputLabel = new JLabel("List of student's clubs");
        addClubToListButton.addActionListener(e -> listModel.addElement(clubTextField.getText()));



        //Student bus or no bus
        JLabel studentBusLabel = new JLabel("Does this student take the bus?");
        ButtonGroup busButtonGroup = new ButtonGroup();
        JRadioButton takesBusTrue = new JRadioButton("Yes");
        takesBusTrue.setActionCommand("Yes");
        JRadioButton takesBusFalse = new JRadioButton("No");
        takesBusFalse.setActionCommand("No");

        busButtonGroup.add(takesBusTrue);
        busButtonGroup.add(takesBusFalse);

        //students rating of school
        JLabel studentSchoolRatingLabel = new JLabel("Select on a scale of 1-5 how much the student likes school in general");
        JSlider studentSchoolRatingSlider = new JSlider(1,5);

        //students rating of GDHS
        JLabel studentGDHSRatingLabel = new JLabel("Select on a scale of 1-5 how much the student likes GDHS");
        JSlider studentGDHSRatingSlider = new JSlider(1,5);

        //button to send data to text doc
        JButton printToDocButton = new JButton("Click to print data to text file");
        printToDocButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writer.println("Student's grade: " +studentGradeButtonGroup.getSelection().getActionCommand());
                writer.println("Student's gender: " +studentGenderButtonGroup.getSelection().getActionCommand());
                writer.println("Student's age: " +studentAgeSpinner.getValue());
                writer.println("Number of classes First Semester: " +studentClassesFirstSemesterSpinner.getValue());
                writer.println("Number of classes Second Semester: " +studentClassesSecondSemesterSpinner.getValue());
                writer.println("Student's average last year: " +studentAverageLastYearTextField.getValue()+ "%");
                writer.println("Student anticipated average this year: " + studentAnticipatedAverageTextField.getValue()+ "%");
                writer.println("Clubs student is involved in: " +clubsList.getSelectedValuesList()); //figure this out
                writer.println("Student takes bus: " +busButtonGroup.getSelection().getActionCommand());
                writer.println("Students rating of school out of 5: " +studentSchoolRatingSlider.getValue());
                writer.println("Students rating of GDHS out of 5: " +studentGDHSRatingSlider.getValue());
                writer.close();//THIS HAS TO BE HERE
            }
        });

        //adding grade category to content
        content.add(studentGradeLabel);
        content.add(studentGradeA);
        content.add(studentGradeB);
        content.add(studentGradeC);
        content.add(studentGradeD);
        content.add(studentGradeF);

        //adding gender category to content
        content.add(studentGenderLabel);
        content.add(studentMale);
        content.add(studentFemale);
        content.add(studentOther);

        //adding age category to content
        content.add(studentAgeLabel);
        content.add(studentAgeSpinner);

        //adding first semester category to content
        content.add(studentClassesFirstSemesterLabel);
        content.add(studentClassesFirstSemesterSpinner);

        //adding second semester category to content
        content.add(studentClassesSecondSemesterLabel);
        content.add(studentClassesSecondSemesterSpinner);

        //adding student average last year category to content
        content.add(studentAverageLastYearLabel);
        content.add(studentAverageLastYearTextField);

        //adding student anticipated average category to content
        content.add(studentAnticipatedAverageLabel);
        content.add(studentAnticipatedAverageTextField);

        //adding sports/ teams category to content
        content.add(clubsAndActiviesLabel);
        content.add(clubTextField);
        content.add(addClubToListButton);
        content.add(outputLabel);
        content.add(clubsList);

        //adding bus or no bus category to content
        content.add(studentBusLabel);
        content.add(takesBusTrue);
        content.add(takesBusFalse);

        //adding students rating on school category to content
        content.add(studentSchoolRatingLabel);
        content.add(studentSchoolRatingSlider);

        //adding students rating on GDHS category to content
        content.add(studentGDHSRatingLabel);
        content.add(studentGDHSRatingSlider);

        //adding submit button to content
        content.add(printToDocButton);
        //packing frame
        frame.pack();



    }
}