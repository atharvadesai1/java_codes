import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class quiz implements ActionListener
{
    String question[][] = new String[5][5];
    String answer[] = new String[5];
    JFrame f2;
    JLabel img2,QNo,Question,verticalimg;
    JButton one,two,three,four,five,submit,save;
    JRadioButton op1,op2,op3,op4;
    ButtonGroup option;
    int q = 0;
    int solved = 0;
    String ans[] = new String[]{null , null , null , null , null} ;
    JLabel score;
    quiz()
    {
        f2 = new JFrame();
        f2.setVisible(true);
        f2.setSize(1000,500);
        f2.setLayout(null);
        f2.setLocationRelativeTo(null);
        f2.setBackground(Color.WHITE);
        f2.setTitle("DJSCE ADVANCED");


        ImageIcon  image2 = new ImageIcon(getClass().getResource("images/quiz.png"));
        img2 = new JLabel(image2);
        img2.setBounds(10,10,1500,400);
        f2.add(img2);
        

        QNo = new JLabel("1");
        QNo.setBounds(120,450,20,40);
        QNo.setFont(new Font("Quicksand" , Font.BOLD , 18));
        f2.add(QNo);

        
        Question = new JLabel();
        Question.setBounds(150,450,800,40);
        Question.setFont(new Font("Quicksand" , Font.BOLD , 18));
        f2.add(Question);
        
        op1 = new JRadioButton();
        op1.setBounds(150,490,800,40);
        op1.setFont(new Font("Quicksand" , Font.BOLD , 18));
        op1.addActionListener(this);
        f2.add(op1);

        op2 = new JRadioButton();
        op2.setBounds(150,530,800,40);
        op2.setFont(new Font("Quicksand" , Font.BOLD , 18));
        op2.addActionListener(this);
        f2.add(op2);

        op3 = new JRadioButton();
        op3.setBounds(150,570,800,40);
        op3.setFont(new Font("Quicksand" , Font.BOLD , 18));
        op3.addActionListener(this);
        f2.add(op3);

        op4 = new JRadioButton();
        op4.setBounds(150,610,800,40);
        op4.setFont(new Font("Quicksand" , Font.BOLD , 18));
        op4.addActionListener(this);
        f2.add(op4);

        option = new ButtonGroup();
        option.add(op1);
        option.add(op2);
        option.add(op3);
        option.add(op4);



        ImageIcon  vertical = new ImageIcon(getClass().getResource("images/verticalline.png"));
        verticalimg = new JLabel(vertical);
        verticalimg.setBounds(1000,140,5,900);
        f2.add(verticalimg);


        one  = new JButton("1");
        one.setBounds(1100,500,40,40);
        one.setBackground(Color.WHITE);
        one.setForeground(Color.BLACK);
        one.addActionListener(this);
        f2.add(one);

        two  = new JButton("2");
        two.setBounds(1200,500,40,40);
        two.setBackground(Color.WHITE);
        two.setForeground(Color.BLACK);
        two.addActionListener(this);
        f2.add(two);

        three  = new JButton("3");
        three.setBounds(1300,500,40,40);
        three.setBackground(Color.WHITE);
        three.setForeground(Color.BLACK);
        three.addActionListener(this);
        f2.add(three);

        four  = new JButton("4");
        four.setBounds(1100,550,40,40);
        four.setBackground(Color.WHITE);
        four.setForeground(Color.BLACK);
        four.addActionListener(this);
        f2.add(four);

        five  = new JButton("5");
        five.setBounds(1200,550,40,40);
        five.setBackground(Color.WHITE);
        five.setForeground(Color.BLACK);
        five.addActionListener(this);
        f2.add(five);


        submit  = new JButton("EXIT");
        submit.setBounds(1100,700,100,40);
        submit.setBackground(Color.GREEN);
        submit.setForeground(Color.BLACK);
        submit.setEnabled(false);
        submit.addActionListener(this);
        f2.add(submit);

        save  = new JButton("SAVE & NEXT");
        save.setBounds(1300,700,120,40);
        save.setBackground(Color.GREEN);
        save.setForeground(Color.BLACK);
        save.addActionListener(this);
        f2.add(save);

        question[0][0] = "Which method can be used to return a string in upper case letters?";
        question[0][1] = "touppercase()";
        question[0][2] = "toUpperCase()";
        question[0][3] = "tuc()";
        question[0][4] = "uppercase()";

        question[1][0] = "How do you insert SINGLE LINE COMMENTS in Java code?";
        question[1][1] = "/*";
        question[1][2] = "#";
        question[1][3] = "//";
        question[1][4] = "<--";

        question[2][0] = "Which data type is used to create a variable that should store text?";
        question[2][1] = "txt";
        question[2][2] = "string";
        question[2][3] = "int";
        question[2][4] = "mystring";

        question[3][0] = "How do you create a variable with the numeric value 5?";
        question[3][1] = "int a = 5;";
        question[3][2] = "float a = 5;";
        question[3][3] = "int a = 5";
        question[3][4] = "num a = 5;";

        question[4][0] = "How do you create a variable with the floating number 2.8?";
        question[4][1] = "int x = 2.8";
        question[4][2] = "float x = 2.8f;";
        question[4][3] = "x = 2.8;"; 
        question[4][4] = "num x = 2.8";


        answer[0] = "toUpperCase()";
        answer[1] = "//";
        answer[2] = "string";
        answer[3] = "int a = 5;";
        answer[4] = "float x = 2.8f;";

        score = new JLabel();
        score.setBounds(100,670,800,60);
        score.setFont(new Font("Viner Hand ITC" , Font.PLAIN , 50));
        f2.add(score);

        
        

        start(q);
    }

    void start(int count)
    {
        score.setText("");
        QNo.setText(""+(count+1)+".");
        Question.setText(question[count][0]);
        op1.setText(question[count][1]);
        op2.setText(question[count][2]);
        op3.setText(question[count][3]);
        op4.setText(question[count][4]);

        option.clearSelection();
    
        op1.setEnabled(true);  
        op2.setEnabled(true);
        op3.setEnabled(true);
        op4.setEnabled(true);

        if(solved == 4)
        {
            save.setEnabled(false);
            submit.setEnabled(true);
        }
        
    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource() == save)
        {
            q++;
            start(q);
            score.setText("");
        }
        if(a.getSource() == one)
        {
            q=0;
            start(q);
        }
        if(a.getSource() == two)
        {
            q=1;
            start(q);
        }
        if(a.getSource() == three)
        {
            q=2;
            start(q);
        }
        if(a.getSource() == four)
        {
            q=3;
            start(q);
        }
        if(a.getSource() == five)
        {
            q=4;
            start(q);
        }


        if(op1.isSelected())
        {
            ans[q] = op1.getText();
            op2.setEnabled(false);
            op3.setEnabled(false);
            op4.setEnabled(false);
        }
        if(op2.isSelected())
        {
            ans[q] = op2.getText();
            op1.setEnabled(false);
            op3.setEnabled(false);
            op4.setEnabled(false);
        }
        if(op3.isSelected())
        {
            ans[q] = op3.getText();
            op1.setEnabled(false);
            op2.setEnabled(false);
            op4.setEnabled(false);
        }
        if(op4.isSelected())
        {
            ans[q] = op4.getText();
            op1.setEnabled(false);
            op2.setEnabled(false);
            op3.setEnabled(false);
        }

        if(answer[q] == ans[q])
        {
            score.setText("CORRECT ANSWER ");
            score.setForeground(Color.GREEN);
            solved++;
            if(q == 0)
            {
                one.setBackground(Color.GREEN);
                one.setEnabled(false);
            }
            if(q == 1)
            {
                two.setBackground(Color.GREEN);
                two.setEnabled(false);
            }
            if(q == 2)
            {
                three.setBackground(Color.GREEN);
                three.setEnabled(false);
            }
            if(q == 3)
            {
                four.setBackground(Color.GREEN);
                four.setEnabled(false);
            }
            if(q == 4)
            {
                five.setBackground(Color.GREEN);
                five.setEnabled(false);
            }
        }
        if(answer[q] != ans[q] && ans[q] != null)
        {
            score.setText("Wrong Answer");
            score.setForeground(Color.RED);
            solved++;
            if(q == 0)
            {
                one.setBackground(Color.RED);
                one.setEnabled(false);
            }
            if(q == 1)
            {
                two.setBackground(Color.RED);
                two.setEnabled(false);
            }
            if(q == 2)
            {
                three.setBackground(Color.RED);
                three.setEnabled(false);
            }
            if(q == 3)
            {
                four.setBackground(Color.RED);
                four.setEnabled(false);
            }
            if(q == 4)
            {
                five.setBackground(Color.RED);
                five.setEnabled(false);
            }

        }
        if(a.getSource() == submit)
        {
            f2.setVisible(false);
        }
    }
    
    public static void main (String [] z)
    {
        new quiz();
    }
}