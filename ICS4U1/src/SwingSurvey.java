import com.sun.org.apache.xalan.internal.xsltc.compiler.FlowList;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;

public class SwingSurvey{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //need to figure out layout
        frame.setVisible(true);
        JPanel content = new JPanel();
        frame.add(content);
        //preset format for values
        NumberFormat format = NumberFormat.getInstance();
        //formatter for student grades
        NumberFormatter studentGradeFormatter = new NumberFormatter(format);
        studentGradeFormatter.setMinimum(0);
        studentGradeFormatter.setMaximum(100);
        studentGradeFormatter.setAllowsInvalid(false);
        //formatter for student age
        NumberFormatter studentAgeFormatter = new NumberFormatter(format);
        studentAgeFormatter.setMaximum(100);
        studentAgeFormatter.setMinimum(0);
        studentAgeFormatter.setAllowsInvalid(false);

        //Student grade information
        JLabel studentGradeLabel = new JLabel("Enter the student's grade (0-100)");
        studentGradeLabel.setSize(100,50);
        JFormattedTextField studentGradeTextField = new JFormattedTextField(studentGradeFormatter);

        //Student gender
        JLabel studentGenderLabel = new JLabel("Select the student's gender");
        studentGenderLabel.setSize(100,50);
        JComboBox studentGenderComboBox = new JComboBox();
        studentGenderComboBox.addItem("Male");
        studentGenderComboBox.addItem("Female");
        studentGenderComboBox.addItem("Other");

        //Student age
        JLabel studentAgeLabel = new JLabel("Enter the student's age");
        studentAgeLabel.setSize(100,50);
        JFormattedTextField studentAgeTextField = new JFormattedTextField(studentAgeFormatter);

        //adding content to Content Panel
        content.add(studentGradeLabel);
        content.add(studentGradeTextField);
        content.add(studentGenderLabel);
        content.add(studentGenderComboBox);
        content.add(studentAgeLabel);
        content.add(studentAgeTextField);

        frame.pack();
    }
}