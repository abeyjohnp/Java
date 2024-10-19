import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator implements ActionListener
{
    static JFrame f;
    static JLabel l;
    static JButton adder;
    static JButton subtractor;
    static JButton divider;
    static JButton multiplier;
    static JButton equals;
    static JTextField t1,t2,t3;
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        f = new JFrame("Calculator - Abey John");
        f.setSize(600,600);
        f.setLayout(new FlowLayout());

        //l = new JLabel ("");
        //l.setBounds(300,300,70,70);

        adder = new JButton("+");
        subtractor = new JButton("-");
        divider = new JButton("/");
        multiplier = new JButton("*");
        equals = new JButton("=");

        t1 = new JTextField();
        t1.setColumns(10);
        t2 = new JTextField();
        t2.setColumns(10);
        t3 = new JTextField("Result displayed here");
        //t1.setBounds(100,100,100,100);

        adder.addActionListener(c);
        subtractor.addActionListener(c);
        divider.addActionListener(c);
        multiplier.addActionListener(c);
        equals.addActionListener(c);

        f.add(t1);
        f.add(adder);
        f.add(subtractor);
        f.add(divider);
        f.add(multiplier);
        f.add(t2);
        f.add(t3);

        //f.add(l);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==adder)
        {
            adding();
        }
        if (e.getSource()==subtractor)
        {
            subtract();
        }
        if (e.getSource()==multiplier)
        {
            multiply();
        }
        if (e.getSource()==divider)
        {
            divider();
        }
    }

    public void adding()
    {
        int a = Integer.parseInt(t1.getText()) ;
        int b = Integer.parseInt(t2.getText()) ;
        int result = a+b;
        t3.setText("Result ="+result);
    }
    public void subtract()
    {
        int a = Integer.parseInt(t1.getText()) ;
        int b = Integer.parseInt(t2.getText()) ;
        int result = a-b;
        t3.setText("Result ="+result); 
    }
    public void multiply()
    {
        int a = Integer.parseInt(t1.getText()) ;
        int b = Integer.parseInt(t2.getText()) ;
        int result = a*b;
        t3.setText("Result ="+result); 
    }
    public void divider()
    {
        int a = Integer.parseInt(t1.getText()) ;
        int b = Integer.parseInt(t2.getText()) ;
        int result = a/b;
        t3.setText("Result ="+result); 
    }
    
}