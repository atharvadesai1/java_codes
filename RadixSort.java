import java.util.Arrays;

public class RadixSort {
    private static int getMax(int[] arr){
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    private static int[] calculate(int[] arr, int place){
        int[] count = new int[10];
        int[] output = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            int digit = (arr[i]/place) % 10;
            count[digit]++;
        }

        for (int i=1; i<10; i++){
            count[i] += count[i-1];
        }

        for (int i=arr.length-1; i>=0; i--){
            int digit = (arr[i]/place) % 10;
            output[count[digit]-1] = arr[i];
            count[digit]--;
        }

        for (int i=0; i<arr.length; i++){
            arr[i] = output[i];
        }

        return arr;

    }

    public static void radixSort(int[] arr){
        int maxElement = getMax(arr);

        for (int place = 1; (maxElement/place)>0; place*=10){
            arr = calculate(arr, place);
        }
    }

    public static void main(String[] args){
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Elements of array: "+ Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Elements after radix sort: "+ Arrays.toString(arr));
    }
}           


