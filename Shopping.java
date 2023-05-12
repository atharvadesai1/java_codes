import java.io.StreamCorruptedException;
import java.util.*;

public class Shopping {

    static void printmenu()
    {
        System.out.println("1)Add Element");
        System.out.println("2)Delete Element");
        System.out.println("3)Display List");
        System.out.println("4)EXIT!");
    }


    public static void main(String[] args)
    {
        int num,i,k=0;
        Vector<String> shopList = new Vector<String>();
        Scanner sc = new Scanner(System.in);

        do
        {
        printmenu();
        System.out.println("Enter the number for operation:");
        num = sc.nextInt();

            switch(num)
            {
                case 1: System.out.println("Enter an element to add in the list");
                        String Str = sc.next();
                        shopList.insertElementAt(Str, k);
                        k++;
                        System.out.println("Element Inserted !");
                        System.out.println("\n");
                        break;

                case 2: System.out.println("Enter the position of element to be deleted");
                        int post = sc.nextInt();
                        System.out.println("The deleted element is "+shopList.elementAt(post-1));
                        shopList.remove(post-1);
                        k--;
                        System.out.println("\n");
                        break;
                        
                case 3: System.out.println("Shopping List:");
                        for(i=0;i<shopList.size();i++)
                        {
                            System.out.println(1+i+") "+shopList.elementAt(i));
                        } 
                        System.out.println("\n");
                        break;           
            }
        }while(num!=4);
        sc.close();
    }    
        
}
