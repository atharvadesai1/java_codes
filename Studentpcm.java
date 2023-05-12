import java.util.*;

class Student
{
    Scanner s = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = s.next();
        System.out.println("Enter student id:");
        int stu_id = s.nextInt();
        System.out.println("Enter Physics Marks:");
        int phy = s.nextInt();        
        System.out.println("Enter Chemistry Marks:");
        int chem = s.nextInt();        
        System.out.println("Enter Maths Marks:");
        int math = s.nextInt();
        int total = phy + chem + math;
        System.out.println("Total Marks: "+total);
}

public class Studentpcm {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n_stu = sc.nextInt();
        int[] sum = new int[n_stu];
        Student[] objArr = new Student[n_stu];
        sc.close();

        for(int i=0;i<n_stu;i++)
        {
            System.out.println("Details of student "+(i+1));
            objArr[i].studentInfo();
            sum[i] = objArr[i].marks();        
        }
        Arrays.sort(sum);

        for(int j=0;j<n_stu;j++)
        {
            
        }

        
    }
}
