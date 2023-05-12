import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rule implements ActionListener
{
    JLabel atb;
    JCheckBox tick;
    String name;
    JButton start;
    JFrame f3;
    rule(String name)
    {
        this.name = name;
        f3 = new JFrame();
        f3.setSize(1000,800);
        f3.setLayout(null);
        f3.setBackground(Color.WHITE);
        f3.setLocationRelativeTo(null);
        f3.setVisible(true);



        JLabel p = new JLabel("WELCOME "+name.toUpperCase()+" DJSCE ADVANCED QUIZ");
        p.setBounds(250,50,800,40);
        p.setFont(new Font ("Viner Hand ITC" , Font.PLAIN , 20));
        p.setForeground(Color.BLUE);
        f3.add(p);


        JLabel rule = new JLabel();
        rule.setBounds(40,200,800,300);
        rule.setFont(new Font ("Tahoma" , Font .PLAIN , 18));
        rule.setText(
            "<html>"+
                "1.THERE ARE 4 OPTION FOR EACH QUESTION OUT OF WHICH ONLY IS CORRECT"+"<br><br>"+
                "2.ONCE THE OPTION IS SELECTED YOU CANNOT CHANGE IT SO SELECT OPTION WISELY"+"<br><br>"+
                "3.AFTER SELECTING THE OPTION YOU WILL BE ABLE TO KNOW WHETHER THE ANSWER YOU SELECTED WAS RIGHT OR WRONG"+"<br><br>"+
                "4.ALSO THE CORRECT ANSWER WILL BE DISPLAY ON THE SCREEN"+"<br><br>"+
                "5.ANY KIND OF CHEATING OR MALPRACTICE IS NOT ALLOWED"+
            "</html>"
        );
        f3.add(rule);


        tick = new JCheckBox();
        tick.setBounds(40,550,20,20);
        tick.addActionListener(this);
        f3.add(tick);
        

        JLabel read = new JLabel("I have all the instruction carefully and I am ready to give the quiz");
        read.setBounds(65,550,450,20);
        read.setFont(new Font("Calibri" , Font.PLAIN , 15));
        f3.add(read);

        atb = new JLabel();
        atb.setBounds(400,600,300,40);
        atb.setFont(new Font("Viner Hand ITC" , Font.PLAIN , 20));
        atb.setForeground(Color.BLUE);
        f3.add(atb);


        start = new JButton("Start Quiz");
        start.setBounds(800,650,150,40);
        start.setEnabled(false);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.setFont(new Font("Calibri" , Font.PLAIN , 18));
        start.addActionListener(this);
        f3.add(start);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(tick.isSelected())
        {
            atb.setText("ALL THE BEST");
            start.setEnabled(true);
        }
        if(e.getSource() == start)
        {
            f3.setVisible(false);
            new quiz();
        }

    }
    public static void main(String [] z)
    {
        new rule("seon");
    }
}