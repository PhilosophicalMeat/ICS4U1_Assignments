//imports
import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;

public class SwingSurvey{
    public static void main(String[] args) throws IOException {
        //stuff for printing to textdoc
        PrintWriter fileWriter = new PrintWriter(new File("C:\\users\\Ethan\\Desktop\\SwingSurveyDoc.txt"));
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
        JRadioButton studentGradeB = new JRadioButton("B (70%-79%)");
        JRadioButton studentGradeC = new JRadioButton("C (60%-69%)");
        JRadioButton studentGradeD = new JRadioButton("D (50%-59%)");
        JRadioButton studentGradeF = new JRadioButton("F (0%-49%)");
        studentGradeButtonGroup.add(studentGradeA);
        studentGradeButtonGroup.add(studentGradeB);
        studentGradeButtonGroup.add(studentGradeD);
        studentGradeButtonGroup.add(studentGradeC);
        studentGradeButtonGroup.add(studentGradeF);
        String gradeString = "";


        //student age
        JLabel studentGenderLabel = new JLabel("Select the student's gender");
        studentGenderLabel.setSize(100,50);
        JRadioButton studentMale = new JRadioButton("Male");
        JRadioButton studentFemale = new JRadioButton("Female");
        JRadioButton studentOther = new JRadioButton("Other");
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
        JLabel clubsAndActiviesLabel = new JLabel("Check off the clubs and/ or teams the student is involved with");
        JCheckBoxMenuItem clubsAndActivies = new JCheckBoxMenuItem();
        //clubs
        JCheckBox studentCouncil = new JCheckBox("Student Council");
        JCheckBox artClubCouncil = new JCheckBox("Art Club Council");
        JCheckBox breakfastClub = new JCheckBox("Breakfast Club");
        JCheckBox coffeeHouse = new JCheckBox("Coffee House");
        JCheckBox comboBand = new JCheckBox("Combo Band");
        JCheckBox concertBand = new JCheckBox("Concert Band");
        JCheckBox crochetKnittingClub = new JCheckBox("Crochet/ Knitting Club");
        JCheckBox danceTeam = new JCheckBox("Dance Team");
        JCheckBox DECA = new JCheckBox("DECA");
        JCheckBox earthGreenClub = new JCheckBox("Earth/ Green Club");
        JCheckBox filmFestival = new JCheckBox("Film Festival");
        JCheckBox genderSexualityAlliance = new JCheckBox("Gender Sexuality Alliance");
        JCheckBox graphicNovelClub = new JCheckBox("Graphic Novel Club");
        JCheckBox jazzBand = new JCheckBox("Jazz Band");
        JCheckBox linkCrew = new JCheckBox("Link Crew");
        JCheckBox mathProblemSolvingClub = new JCheckBox("Math Problem Solving Club");
        JCheckBox musicCouncil = new JCheckBox("Music Council");
        JCheckBox oneActPlayFestival = new JCheckBox("One Act Play Festival");
        JCheckBox photographyClub = new JCheckBox("Photography Club");
        JCheckBox pingPongClub = new JCheckBox("Ping Pong Club");
        JCheckBox promCommittee = new JCheckBox("Prom Committee");
        JCheckBox REACH = new JCheckBox("REACH");
        JCheckBox SJL = new JCheckBox("Social Justice Alliance");
        JCheckBox soundLightingCrew = new JCheckBox("Sound and Lighting Crew");
        JCheckBox spokenWordTeam = new JCheckBox("Spoken Word Team");
        JCheckBox symphonicBand = new JCheckBox("Symphonic Band");
        JCheckBox whitePineAwardBookClub = new JCheckBox("White Pine Award Book Club");
        JCheckBox woodworkingClub = new JCheckBox("Woodworking Club");

        //sports teams
        JCheckBox archery = new JCheckBox("Archery");
        JCheckBox badmintonJrSrCoed = new JCheckBox("Badminton (Jr.-Sr. co-ed)");
        JCheckBox baseballBoysVarsity = new JCheckBox("Baseball(Varsity Boys)");
        JCheckBox basketballJrBoys = new JCheckBox("Basketball (Jr. Boys)");
        JCheckBox basketballJrGirls = new JCheckBox("Basketball (Jr. Girls)");
        JCheckBox basketballSrBoys = new JCheckBox("Basketball (Sr. Boys)");
        JCheckBox basketballSrGirls = new JCheckBox("Basketball (Sr. Girls)");
        JCheckBox crossCountry = new JCheckBox("Cross Country");
        JCheckBox curlingVarsity = new JCheckBox("Curling (Varsity)");
        JCheckBox fieldHockeyJrGirls = new JCheckBox("Field Hockey (Jr.Girls)");
        JCheckBox fieldHockeySrGirls = new JCheckBox("Field Hockey (Sr. Girls)");
        JCheckBox flagFootballGirls = new JCheckBox("Flag Footballs (Girls)");
        JCheckBox footballJrBoys = new JCheckBox("Football (Jr. Boys)");
        JCheckBox footballSrBoys = new JCheckBox("Football (Sr. Boys)");
        JCheckBox golf = new JCheckBox("Golf");
        JCheckBox hockeyJrBoys = new JCheckBox("Hockey (Jr. Boys)");
        JCheckBox hockeySrBoys = new JCheckBox("Hockey (Sr. Boys)");
        JCheckBox hockeyVarsityGirls = new JCheckBox("Hockey (Varsity Girls)");
        JCheckBox hockeyGirlsTournamentTeam = new JCheckBox("Hockey - Girls Tournament Team");
        JCheckBox lacrosseBoys = new JCheckBox("Lacrosse (Boys)");
        JCheckBox lacrosseGirls = new JCheckBox("Lacrosse (Girls)");
        JCheckBox roboticsTeam = new JCheckBox("Robotics Team");
        JCheckBox rugbyGirlsVarsity = new JCheckBox("Rugby (Varsity Girls)");
        JCheckBox rugbyJrBoys = new JCheckBox("Rugby (Jr. Boys)");
        JCheckBox rugbySrBoys = new JCheckBox("Rugby (Sr. Boys)");
        JCheckBox skiSnowboardTeam = new JCheckBox("Ski & Snowboard Team");
        JCheckBox soccerJrBoys = new JCheckBox("Soccer (Jr. Boys)");
        JCheckBox soccerJrGirls = new JCheckBox("Soccer (Jr. Girls)");
        JCheckBox soccerSrBoys = new JCheckBox("Soccer (Sr. Boys)");
        JCheckBox soccerSrGirls = new JCheckBox("Soccer (Sr. Girls)");
        JCheckBox softballSloPitchVarsityGirls = new JCheckBox("Softball (Slo Pitch Varsity Girls)");
        JCheckBox swimTeam = new JCheckBox("Swim Team");
        JCheckBox tennisTeam = new JCheckBox("Tennis Team");
        JCheckBox trackAndField = new JCheckBox("Track and Field");
        JCheckBox ultimateFrisbee = new JCheckBox("Ultimate Frisbee");
        JCheckBox volleyballCoedVarsity = new JCheckBox("Volleyball (co-ed varsity)");
        JCheckBox volleyballJrBoys = new JCheckBox("Volleyball (Jr. Boys)");
        JCheckBox volleyballJrGirls = new JCheckBox("Volleyball (Jr. Girls)");
        JCheckBox volleyballSrBoys = new JCheckBox("Volleyball (Sr. Boys)");
        JCheckBox volleyballSrGirls = new JCheckBox("Volleyball (Sr. Girls)");
        JCheckBox wrestling = new JCheckBox("Wrestling");
        JCheckBox yogaClub = new JCheckBox("Yoga Club");

        //adding it all to the checkbox group
        clubsAndActivies.add(studentCouncil);
        clubsAndActivies.add(artClubCouncil);
        clubsAndActivies.add(breakfastClub);
        clubsAndActivies.add(coffeeHouse);
        clubsAndActivies.add(comboBand);
        clubsAndActivies.add(concertBand);
        clubsAndActivies.add(crochetKnittingClub);
        clubsAndActivies.add(danceTeam);
        clubsAndActivies.add(DECA);
        clubsAndActivies.add(earthGreenClub);
        clubsAndActivies.add(filmFestival);
        clubsAndActivies.add(genderSexualityAlliance);
        clubsAndActivies.add(graphicNovelClub);
        clubsAndActivies.add(jazzBand);
        clubsAndActivies.add(linkCrew);
        clubsAndActivies.add(mathProblemSolvingClub);
        clubsAndActivies.add(musicCouncil);
        clubsAndActivies.add(oneActPlayFestival);
        clubsAndActivies.add(photographyClub);
        clubsAndActivies.add(pingPongClub);
        clubsAndActivies.add(promCommittee);
        clubsAndActivies.add(REACH);
        clubsAndActivies.add(SJL);
        clubsAndActivies.add(soundLightingCrew);
        clubsAndActivies.add(spokenWordTeam);
        clubsAndActivies.add(symphonicBand);
        clubsAndActivies.add(whitePineAwardBookClub);
        clubsAndActivies.add(woodworkingClub);
        clubsAndActivies.add(archery);
        clubsAndActivies.add(badmintonJrSrCoed);
        clubsAndActivies.add(baseballBoysVarsity);
        clubsAndActivies.add(basketballJrBoys);
        clubsAndActivies.add(basketballJrGirls);
        clubsAndActivies.add(basketballSrBoys);
        clubsAndActivies.add(basketballSrGirls);
        clubsAndActivies.add(crossCountry);
        clubsAndActivies.add(curlingVarsity);
        clubsAndActivies.add(fieldHockeyJrGirls);
        clubsAndActivies.add(fieldHockeySrGirls);
        clubsAndActivies.add(flagFootballGirls);
        clubsAndActivies.add(footballJrBoys);
        clubsAndActivies.add(footballSrBoys);
        clubsAndActivies.add(golf);
        clubsAndActivies.add(hockeyJrBoys);
        clubsAndActivies.add(hockeySrBoys);
        clubsAndActivies.add(hockeyVarsityGirls);
        clubsAndActivies.add(hockeyGirlsTournamentTeam);
        clubsAndActivies.add(lacrosseBoys);
        clubsAndActivies.add(lacrosseGirls);
        clubsAndActivies.add(roboticsTeam);
        clubsAndActivies.add(rugbyGirlsVarsity);
        clubsAndActivies.add(rugbyJrBoys);
        clubsAndActivies.add(rugbySrBoys);
        clubsAndActivies.add(skiSnowboardTeam);
        clubsAndActivies.add(soccerJrBoys);
        clubsAndActivies.add(soccerJrGirls);
        clubsAndActivies.add(soccerSrBoys);
        clubsAndActivies.add(soccerSrGirls);
        clubsAndActivies.add(softballSloPitchVarsityGirls);
        clubsAndActivies.add(swimTeam);
        clubsAndActivies.add(tennisTeam);
        clubsAndActivies.add(trackAndField);
        clubsAndActivies.add(ultimateFrisbee);
        clubsAndActivies.add(volleyballCoedVarsity);
        clubsAndActivies.add(volleyballJrBoys);
        clubsAndActivies.add(volleyballJrGirls);
        clubsAndActivies.add(volleyballSrBoys);
        clubsAndActivies.add(volleyballSrGirls);
        clubsAndActivies.add(wrestling);
        clubsAndActivies.add(yogaClub);



        //Student bus or no bus
        JLabel studentBusLabel = new JLabel("Does this student take the bus?");
        ButtonGroup busButtonGroup = new ButtonGroup();
        JRadioButton takesBusTrue = new JRadioButton("Yes");
        JRadioButton takesBusFalse = new JRadioButton("No");

        busButtonGroup.add(takesBusTrue);
        busButtonGroup.add(takesBusFalse);

        //students rating of school
        JLabel studentSchoolRatingLabel = new JLabel("Select on a scale of 1-5 how much the student likes school in general");
        JSlider studentSchoolRatingSlider = new JSlider(1,5);

        //students rating of GDHS
        JLabel studentGDHSRatingLabel = new JLabel("Select on a scale of 1-5 how much the student likes GDHS");
        JSlider studentGDHSRatingSlider = new JSlider(1,5);

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
        content.add(clubsAndActivies);
        content.add(studentCouncil);
        content.add(artClubCouncil);
        content.add(breakfastClub);
        content.add(coffeeHouse);
        content.add(comboBand);
        content.add(concertBand);
        content.add(crochetKnittingClub);
        content.add(danceTeam);
        content.add(DECA);
        content.add(earthGreenClub);
        content.add(filmFestival);
        content.add(genderSexualityAlliance);
        content.add(graphicNovelClub);
        content.add(jazzBand);
        content.add(linkCrew);
        content.add(mathProblemSolvingClub);
        content.add(musicCouncil);
        content.add(oneActPlayFestival);
        content.add(photographyClub);
        content.add(pingPongClub);
        content.add(promCommittee);
        content.add(REACH);
        content.add(SJL);
        content.add(soundLightingCrew);
        content.add(spokenWordTeam);
        content.add(symphonicBand);
        content.add(whitePineAwardBookClub);
        content.add(woodworkingClub);
        content.add(archery);
        content.add(badmintonJrSrCoed);
        content.add(baseballBoysVarsity);
        content.add(basketballJrBoys);
        content.add(basketballJrGirls);
        content.add(basketballSrBoys);
        content.add(basketballSrGirls);
        content.add(crossCountry);
        content.add(curlingVarsity);
        content.add(fieldHockeyJrGirls);
        content.add(fieldHockeySrGirls);
        content.add(flagFootballGirls);
        content.add(footballJrBoys);
        content.add(footballSrBoys);
        content.add(golf);
        content.add(hockeyJrBoys);
        content.add(hockeySrBoys);
        content.add(hockeyVarsityGirls);
        content.add(hockeyGirlsTournamentTeam);
        content.add(lacrosseBoys);
        content.add(lacrosseGirls);
        content.add(roboticsTeam);
        content.add(rugbyGirlsVarsity);
        content.add(rugbyJrBoys);
        content.add(rugbySrBoys);
        content.add(skiSnowboardTeam);
        content.add(soccerJrBoys);
        content.add(soccerJrGirls);
        content.add(soccerSrBoys);
        content.add(soccerSrGirls);
        content.add(softballSloPitchVarsityGirls);
        content.add(swimTeam);
        content.add(tennisTeam);
        content.add(trackAndField);
        content.add(ultimateFrisbee);
        content.add(volleyballCoedVarsity);
        content.add(volleyballJrBoys);
        content.add(volleyballJrGirls);
        content.add(volleyballSrBoys);
        content.add(volleyballSrGirls);
        content.add(wrestling);
        content.add(yogaClub);

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

        //packing frame
        frame.pack();



    }
}