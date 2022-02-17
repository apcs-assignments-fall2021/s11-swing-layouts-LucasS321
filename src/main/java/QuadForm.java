import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuadForm {

    public QuadForm() {
        //1. Create the frame.
        JFrame frame = new JFrame("Quadratic Formula");
        // frame.setLayout(...);

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.

        // YOUR CODE HERE

        //4. Size the frame.
        // frame.setSize(400, 400);
        frame.pack();

        //5. Show it.
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        QuadForm qf = new QuadForm();
    }
}
