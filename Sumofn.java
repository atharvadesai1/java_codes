import java.util.*;
public class Sumofn {

    static int sum(int num)
    {
        if(num==1)
        return 1;
        
        else
        return (num)+ sum(num-1);
    }
    public static void main(String[] args)
    {
        int n,k;
        System.out.println("Enter the value for n number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = sum(n);
        System.out.println("The sum of n number is "+k);

    }
}
