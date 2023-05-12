import java.util.*;

public class Overloading {
    public static void main(String[] aStrings)
    {
        Area a = new Area();
        a.arean(3);
        a.arean(7,6);
        a.arean(5.2f);
    }
}


class Area
{
    void arean()
    {
        System.out.println("Showing the area");
    }
    void arean(int x)
    {
        System.out.println("Area of square is "+x*x);

    }

    void arean(int p,int q)
    {
        System.out.println("Area of rectangle is "+p*q);

    }

    void arean(float k)
    {
        System.out.println("Area of circle is "+3.14f*k*k);

    }

}

