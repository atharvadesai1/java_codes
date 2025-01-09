import java.util.Scanner;

class MergeSort {
    public void performMerging(int[] arr, int lb, int mid, int ub) {
        int n1 = mid - lb + 1; // Size of the left subarray
        int n2 = ub - mid;     // Size of the right subarray

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copying data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[lb + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = lb;     

        // Merging the temporary arrays back into the original array
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copying remaining elements of left array, if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copying remaining elements of right array, if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public int[] doMergeSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            doMergeSort(arr, lb, mid);
            doMergeSort(arr, mid + 1, ub);
            this.performMerging(arr, lb, mid, ub);
        }
        return arr;
    }
}

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeSort ms = new MergeSort();

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int lb = 0;
        int ub = size - 1;
        int[] ans = ms.doMergeSort(arr, lb, ub);

        System.out.println("Sorted array: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
