import java.util.Scanner;

public class Vampire {
    public static void main(String[] args)
    {
        int num,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 4 digit number:");
        num = s.nextInt();
        s.close();
        int copy = num;
        
        int digit[] = new int[4];

        for(i=0;i<4;i++)
        {
            digit[i] = num%10;
            num = num/10;
        }

        int result = Vamp(digit,copy);
        if(result==1){
            System.out.println(copy +" is a Vampire Number");
        }
        else
        {
            System.out.println(copy +" is not a Vampire Number");
        }
    }

    public static int Vamp(int[] digit,int number)
    {
        int check=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++)
                {
                    for(int l=0;l<4;l++)
                    {
                        if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l)
                        {
                            check = ((digit[i]*10 + digit[j])*(digit[k]*10 + digit[l]));
                            if (check == number)
                            {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
