
import java.util.Scanner;

public class Kadane{
    public int findMaxValueofSubarray(int[] arr){
        int maxValue = Integer.MIN_VALUE;
        int current = 0;

        for (int i=0; i<arr.length; i++){
            current += arr[i];
            if (current > maxValue){
                maxValue = current;
            }

            if (current <= 0){
                current = 0;
            }
            else{
                maxValue = Math.max(current, maxValue);
            }
        }
        return maxValue;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array: ");
        String s = sc.nextLine();
        String[] arrayString = s.split(" ");
        int arr[] = new int[arrayString.length];

        for (int i=0; i<arrayString.length; i++){
            arr[i] = Integer.parseInt(arrayString[i]);
        }

        Kadane kadane = new Kadane();
        int ans = kadane.findMaxValueofSubarray(arr);
        System.out.println("Maximum Value of Sub-Array is "+ ans);
    }
}