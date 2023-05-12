import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rule
{
    String name;
    rule(String name)
    {
        this.name = name;
        JFrame f3 = new JFrame();
        f3.setSize(1000,800);
        f3.setLayout(null);
        f3.setBackground(Color.WHITE);
        f3.setLocationRelativeTo(null);
        f3.setVisible(true);



        JLabel p = new JLabel("WELCOME "+name.toUpperCase()+" DJSCE ADVANCED QUIZ");
        p.setBounds(250,50,450,40);
        p.setFont(new Font ("Viner Hand ITC" , Font.PLAIN , 20));
        p.setForeground(Color.BLUE);
        f3.add(p);


        JLabel rule = new JLabel();
        rule.setBounds(40,100,400,100);
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


        // JCheckBox box = new JCheckBox();
        // box.setBounds(40,250,20,20);
        // f3.add(box);



    }
    public static void main(String [] z)
    {
        new rule("seon");
    }
}