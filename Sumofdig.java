import java.util.*;

public class Sumofdig {
    public static void main(String[] args)
    {
        // Input in = new Input();
        Sod sd = new Sod();
        // in.start();
        sd.InputMy();
        sd.SodMy();
    }
}

class Input 
{
    int num;
    void InputMy(){
        System.out.println("Enter the number:");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
    }
}

class Sod extends Input
{
    
    void SodMy()
    {
        int k,sum=0;
        k= num;
            while(k!=0)
            {
                num = num%10;
                sum = sum + num;
                num= k/10;
                k=num;
            }        

            System.out.println("The sum of digits of the number is "+sum);
    }
}
