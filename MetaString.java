import java.util.*;

public class MetaString {
    public static void main(String[] args)
    {
        boolean flag=false;
        int j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string:");
        String str1 = sc.next();
        System.out.println("Enter the 2nd string:");
        String str2 = sc.next();
        int[] swap = new int[20];
        sc.close();

        if(str1.length() != str2.length())
        {
            flag = false;
        }
        else
        {            
            for (int i=0;i<str1.length();i++)
            {
                int count=0;
                if(str1.charAt(i) != str2.charAt(i))
                {
                    count++;
                    if(count>2)
                    {
                        flag=false;
                        break;
                    }
                    swap[j] = str1.charAt(i);
                    swap[j+1] = str2.charAt(i);
                    j+= 2;
                }
            }
            if(swap[0]==swap[3] && swap[1]==swap[2])
            {
                flag=true;
            }
            else
            {
                flag=false;
            }
        }

        if(flag)
        {
            System.out.println(str1+" and "+str2+" are Meta Strings");
        }
        else
        {
            System.out.println(str1+" and "+str2+" are not Meta Strings");
        }


    }
    
}
