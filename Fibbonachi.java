import java.util.*;

public class Fibbonachi {
    public static void main(String[] args) {
        int n,i,a=0,b=1,c;
        System.out.println("Enter the value of n for fibbonachi series:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        // System.out.println("The Fibbonachi series is:");
        if(n>=2)
        {
            System.out.println("The Fibbonachi series is:");
            System.out.println("0\n1");
        }
        else if(n==1)
        {
            System.out.println("The Fibbonachi series is:");
            System.out.println("0");
        }
        else
        {
            System.out.println("Enter the correct value of n for fibbonachi series");
        }

        for(i=0;i<n-2;i++)
        {
            c= a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
