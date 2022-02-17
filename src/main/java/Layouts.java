import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layouts {

    // JFrame FlowLayout Example
    public static void flow() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("FlowLayout");
        // Need to manually set as FlowLayout
        frame.setLayout(new FlowLayout());

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        JButton button1 = new JButton("Button 1");
        frame.add(button1);

        JButton button2 = new JButton("But2");
        frame.add(button2);

        JButton button3 = new JButton("3");
        frame.add(button3);

        JButton button4 = new JButton("Button Button 4");
        frame.add(button4);

        JButton button5 = new JButton("Button 5");
        frame.add(button5);

        JButton button6 = new JButton("Button 6");
        frame.add(button6);

        // 4. Size the frame
        frame.setSize(450, 150);

        // 5. Show the frame
        frame.setVisible(true);
    }

    // JFrame BorderLayout Example
    public static void border() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("BorderLayout");
        // This line is optional, because BorderLayout is the default
        // layouts for JFrames
//        frame.setLayout(new BorderLayout());

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        JButton button1 = new JButton("BorderLayout.NORTH");
        frame.add(button1, BorderLayout.NORTH);

        JButton button2 = new JButton("BorderLayout.SOUTH");
        frame.add(button2, BorderLayout.SOUTH);

        JButton button3 = new JButton("BorderLayout.WEST");
        frame.add(button3, BorderLayout.WEST);

        JButton button4 = new JButton("BorderLayout.EAST");
        frame.add(button4, BorderLayout.EAST);

        JButton button5 = new JButton("BorderLayout.CENTER");
        frame.add(button5, BorderLayout.CENTER);

        // 4. Size the frame
        frame.setSize(550, 150);

        // 5. Show the frame
        frame.setVisible(true);
    }

    // JFrame BoxLayout (X-axis) Example
    public static void boxX() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("BoxLayout");
        // Setting a BoxLayout is a bit more complicated
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        JButton button1 = new JButton("Button 1");
        frame.add(button1);

        JButton button2 = new JButton("But2");
        frame.add(button2);

        JButton button3 = new JButton("3");
        frame.add(button3);

        JButton button4 = new JButton("Button Button 4");
        frame.add(button4);

        JButton button5 = new JButton("Button 5");
        frame.add(button5);

        JButton button6 = new JButton("Button 6");
        frame.add(button6);

        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);
    }

    // JFrame BoxLayout (Y-axis) Example
    public static void boxY() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("BoxLayout");
        // Setting a BoxLayout is a bit more complicated
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        JButton button1 = new JButton("Button 1");
        frame.add(button1);

        JButton button2 = new JButton("But2");
        frame.add(button2);

        JButton button3 = new JButton("3");
        frame.add(button3);

        JButton button4 = new JButton("Button Button 4");
        frame.add(button4);

        JButton button5 = new JButton("Button 5");
        frame.add(button5);

        JButton button6 = new JButton("Button 6");
        frame.add(button6);

        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        flow();
        border();
        boxX();
        boxY();
    }

}
