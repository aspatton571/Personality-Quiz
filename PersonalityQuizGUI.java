// Project name: Personality-Quiz
// Author: Quinn Clayburn
// Date: 4/26/2025
// Description: This class will create the graphical user interface for the personality quiz application.



import javax.swing.*;

public class PersonalityQuizGUI {


    private JFrame frame;
    private JButton startButton;


    public PersonalityQuizGUI() {
        frame = new JFrame("Personality Quiz");
        startButton = new JButton("Start Quiz");

        // basic placeholder frame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        startButton.setBounds(10, 10, 100, 30);
        frame.add(startButton);


    }

    public JFrame getFrame() {
        return frame;

    }

    public void setFrame(JFrame frame) {
        this.frame = frame;

    }

    public JButton getStartButton() {
        return startButton;
    }

    public void setStartButton(JButton startButton) {
        this.startButton = startButton;

    }

    public void display() {
        frame.setVisible(true);
    }
}
