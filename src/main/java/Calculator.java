import jdk.javadoc.internal.doclets.formats.html.markup.Script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {

    public Calculator() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("Calculator");
        // frame.setLayout(...);

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        // Setting a BoxLayout is a bit more complicated
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame


        JPanel p0 = new JPanel();
        p0.setLayout(new BoxLayout(p0,BoxLayout.X_AXIS));
        frame.add(p0);
        JTextArea Output = new JTextArea();
        p0.add(Output);

        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1,BoxLayout.X_AXIS));
        frame.add(p1);
        JButton seven = new JButton("7");
        p1.add(seven);

        JButton eight = new JButton("8");
        p1.add(eight);

        JButton nine = new JButton("9");
        p1.add(nine);

        JButton divide = new JButton("/");
        p1.add(divide);

        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2,BoxLayout.X_AXIS));
        frame.add(p2);
        JButton four = new JButton("4");
        p2.add(four);

        JButton five = new JButton("5");
        p2.add(five);

        JButton six = new JButton("6");
        p2.add(six);

        JButton multiply = new JButton("*");
        p2.add(multiply);

        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3,BoxLayout.X_AXIS));
        frame.add(p3);
        JButton one = new JButton("1");
        p3.add(one);

        JButton two = new JButton("2");
        p3.add(two);

        JButton three = new JButton("3");
        p3.add(three);

        JButton minus = new JButton("-");
        p3.add(minus);

        JPanel p4 = new JPanel();
        p4.setLayout(new BoxLayout(p4,BoxLayout.X_AXIS));
        frame.add(p4);
        JButton zero = new JButton("0");
        p4.add(zero);

        JButton decimal = new JButton(".");
        p4.add(decimal);

        JButton equals = new JButton("=");
        p4.add(equals);

        JButton plus = new JButton("+");
        p4.add(plus);

        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);
        // YOUR CODE HERE

        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);


        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                    Output.setText(Output.getText()+"1");
            }
        });
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"2");
            }
        });
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"3");
            }
        });
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"4");
            }
        });
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"5");
            }
        });
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"6");
            }
        });
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"7");
            }
        });
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"8");
            }
        });
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"9");
            }
        });
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"-");
            }
        });
        decimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+".");
            }
        });
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"/");
            }
        });
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"*");
            }
        });
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Output.setText(Output.getText()+"+");
            }
        });
        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try{
                    ScriptEngine val$engine = engine;
                    Output.setText((String) engine.eval(("1 + 5 +6")));
                }  catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }

    public static void main(String[] args) throws ScriptException {
        Calculator c = new Calculator();
    }
}
