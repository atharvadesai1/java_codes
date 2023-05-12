import java.util.*;

public class Countnumber {
    public static void main(String[] args)
    {
        int count= 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        
        while(num!=0)
        {
            num = num/10;
            count++;
        }
        System.out.println("Total digits "+count);
    }
}
