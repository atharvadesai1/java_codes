import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Scannerm {
    public static void main(String[] args) throws IOException
    {
        float a,b,c;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Insert two numbers to add");
        a = Float.parseFloat(br.readLine());
        b = Float.parseFloat(br.readLine());
        c= a+b;
        System.out.println("The sum is "+ c);
    }
}
