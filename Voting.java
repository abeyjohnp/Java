import java.awt.event.*;
import javax.swing.*;
class Voting implements ActionListener
{
    static JFrame f ;
    static JLabel l1,l2;
    static JTextField t1 ;
    static JButton b1;
    public static void main(String[] args) 
    {
        Voting o = new Voting();
        f = new JFrame ("Voting Eligibilty Checker");
        f.setSize(500,500);
        l1 = new JLabel();
        b1 = new JButton("Enter");
        t1 = new JTextField("");
        l1.setBounds(150, 150, 100, 30);  
        l1.setText("Enter Age : "); 

        l2 = new JLabel();
        l2.setBounds(250, 300, 150, 30);

        t1.setBounds(250,150,100,20);
        b1.setBounds(200, 200, 100, 50);  
        b1.addActionListener(o);
        f.setLayout(null);    
        f.setVisible(true);
        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(l2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            if ((Integer.parseInt(t1.getText()))<18)
            {
                l2.setText("Not Eligible.");
                l2.setBounds(250,300,100,70);
            }
            else
            {
                l2.setText("Eligible.");
                l2.setBounds(250,300,100,70);
            }
        }
    }
}   