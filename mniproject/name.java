import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class name implements ActionListener
{
    JFrame f1;
    JLabel l,name,img1;
    JButton b ;
    JTextField tf;

    name()
    {
        f1 = new JFrame();
        f1.setLayout(null);
        f1.setTitle("DJSCE ADVANCED");
        f1.setVisible(true);
        f1.setSize(1000,600);
        f1.setLocationRelativeTo(null);
        f1.setBackground(Color.WHITE);
   
        ImageIcon  image1 = new ImageIcon(getClass().getResource("images/first.png"));
        img1 = new JLabel(image1);
        img1.setBounds(0,0,650,500);
        f1.add(img1);

        l = new JLabel("Enter your Name");
        l.setFont(new Font("Viner Hand ITC" , Font.BOLD , 20));
        l.setForeground(Color.BLUE);
        l.setBounds(700,150,300,20);
        f1.add(l);

        tf = new JTextField();
        tf.setBounds(700,200,200,20);
        f1.add(tf);

        name = new JLabel("* PLEASE ENTER YOUR CORRECT NAME *");
        name.setBounds(700,220,200,20);
        name.setFont(new Font("Calibri" , Font.PLAIN , 10));
        name.setForeground(Color.RED);
        f1.add(name);

        

        b = new JButton("SAVE & NEXT");
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);
        b.setBounds(800,350,120,20);
        b.addActionListener(this);
        f1.add(b);   
    }
    public void actionPerformed(ActionEvent a)
    {
        String name = tf.getText();
        f1.setVisible(false);
        new rule(name);
    }
    public static void main(String [] z)
    {
        new name();
    }
}