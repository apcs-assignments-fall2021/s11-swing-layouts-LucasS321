import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    public Calculator() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("Calculator");
        // frame.setLayout(...);

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame

        // YOUR CODE HERE

        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}
