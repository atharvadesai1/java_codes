import java.util.*;

class Quadratic {
    public static void main(String[] args)
    {
        double a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        s.close();

        System.out.println("The quadratic equation is "+a+"x + "+b+"x*x + "+c);

        double[] roots = new double[3];
        roots = Quadroots(a,b,c);

        if(roots[2] == 1.0)
        {
            System.out.println("The roots of quadratic equation are:");
            System.out.println(roots[0]+roots[1]);
            System.out.println(roots[0]-roots[1]);
        }
        else
        {
            System.out.println("The roots of quadratic equation are:");
            System.out.println(roots[0]+" + i*"+roots[1]);
            System.out.println(roots[0]+" - i*"+roots[1]);

        }


    }

    static double[] Quadroots(double a,double b,double c)
    {
        double[] roots = new double[3];
        double sqrtTerm = (b*b-4*a*c>=0.0) ? (Math.sqrt(b*b-4*a*c)):(Math.sqrt(-1*(b*b-4*a*c)));
        roots[0] = -b/(2*a);
        roots[1] = (sqrtTerm)/(2*a);
        roots[2] = (b*b-4*a*c>=0.0) ? 1.0:0.0;
        return roots;
    }
}

