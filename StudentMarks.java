import java.util.*;

public class StudentMarks {
    public static void main(String[] args)
    {
        int mrks_sum=0,sub_add=0,all_sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n_stu = sc.nextInt();
        System.out.println("Enter the number of subject");
        int n_sub = sc.nextInt();

        int[][] mrks = new int[n_stu][n_sub]; 
        System.out.println("Enter the marks of student");

        for(int i=0;i<n_stu;i++)
        {
            for(int j=0;j<n_sub;j++)
            {
                mrks[i][j] = sc.nextInt();
            }
        }

        System.out.println("Displaying Marks of Student:");
        for(int i=0;i<n_stu;i++)
        {
            for(int j=0;j<n_sub;j++)
            {
                System.out.print(mrks[i][j]+" ");
                mrks_sum += mrks[i][j];
            }
            System.out.print(" | "+ mrks_sum);
            System.out.print("\n");
            mrks_sum = 0;
        }
        System.out.println("----------------------");
        for(int i=0;i<n_sub;i++)
        {
            for(int j=0;j<n_stu;j++)
            {
                // System.out.println(" ");
            sub_add += mrks[j][i]; 
            }
                System.out.print(sub_add+" ");
                all_sum += sub_add;
                sub_add = 0;
        }
        System.out.print(" | "+all_sum);
    }
    
}
