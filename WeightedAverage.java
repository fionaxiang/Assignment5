import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import java.text.DecimalFormat;

public class WeightedAverage extends JFrame{
    private JLabel  blank1, blank2, blank3, 
    scorepanel, weightpanel, Assignment, Quiz, MidtermExam,FinalExam,Averagescore;
private JTextField  assignment, quiz, midtermexam, finalexam,weight1, weight2,
        weight3, weight4, averagescore;
private JButton Calculate;
private CalculateButton calculate;

final int SIZE=8;

public WeightedAverage()
{
    blank1 = new JLabel("");
    blank2 = new JLabel("");
    blank3 = new JLabel("");
    scorepanel = new JLabel("Score", SwingConstants.CENTER);
    weightpanel = new JLabel("Weight", SwingConstants.CENTER);
   Assignment = new JLabel("Assignment ", SwingConstants.RIGHT);
    Quiz = new JLabel("Quiz ", SwingConstants.RIGHT);
    MidtermExam = new JLabel("Midterm Exam ", SwingConstants.RIGHT);
    FinalExam = new JLabel("Final Exam ", SwingConstants.RIGHT);
    Averagescore = new JLabel("Average score: ", SwingConstants.RIGHT);
    
        //Create four textfields
    assignment = new JTextField(5);
    quiz = new JTextField(5);
    midtermexam = new JTextField(5);
    finalexam = new JTextField(5);
    weight1 = new JTextField(5);
    weight2 = new JTextField(5);
    weight3 = new JTextField(5);
    weight4 = new JTextField(5);
    averagescore = new JTextField(5);
        //create Calculate Button
    JPanel buttonPanel = new JPanel();
    Calculate = new JButton("Calculate");
    calculate = new CalculateButton();
    Calculate.addActionListener(calculate);
        //Create Exit Button
    
        //Set the title of the window
    setTitle("Weighted Average");
        //Get the container
    Container pane = getContentPane();
            //Set the layout
    pane.setLayout(new GridLayout(7,2));
        //Place the components in the pane
    pane.add(blank1);
    pane.add(scorepanel);
    pane.add(weightpanel); 
    pane.add(Assignment);
    pane.add(assignment);
    pane.add(weight1);
    pane.add(Quiz);
    pane.add(quiz);
    pane.add(weight2);
    pane.add(MidtermExam);
    pane.add(midtermexam);
    pane.add(weight3); 
    pane.add(FinalExam);
    pane.add(finalexam);
    pane.add(weight4);    
    pane.add(Averagescore);
    pane.add(averagescore);
    pane.add(blank2); 
    pane.add(Calculate);
    pane.add(blank3);
   
//set the size of the window and display it
    setSize(WIDTH, HEIGHT);
    setVisible(true);
    scorepanel.setBackground(Color.GREEN);
    
}
/**
 * Calculate average scores
 * @author fiona
 *
 */
private class CalculateButton implements ActionListener{
    public void actionPerformed(ActionEvent e){
        double one, wone, two, wtwo,
                three, wthree, four, wfour, ave;
        DecimalFormat twoDigits = new DecimalFormat("0.0");
        one = Double.parseDouble(assignment.getText());
        wone = Double.parseDouble(weight1.getText());
        two = Double.parseDouble(quiz.getText());
        wtwo = Double.parseDouble(weight2.getText());
        three = Double.parseDouble(midtermexam.getText());
        wthree = Double.parseDouble(weight3.getText());
        four = Double.parseDouble(finalexam.getText());
        wfour = Double.parseDouble(weight4.getText());
        ave = (one * wone + two * wtwo + three * wthree
             + four * wfour)/(wone+wtwo+wthree+wfour);
        averagescore.setText(""+ twoDigits.format(ave));
    }
}

}





