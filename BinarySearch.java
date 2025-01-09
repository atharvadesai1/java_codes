import java.util.*;

class BinarySearch{
    public int searchElement(int[] arr, int x){
        Arrays.sort(arr);
        System.out.print("Sorting the array: "); 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        int index = -1;
        int lb = 0;
        int ub = arr.length - 1;
        
        while(lb < ub){
            int mid = (int) ((lb+ub)/2);

            if (arr[mid] == x){
                return mid;
            }else if(arr[mid] < x){
                lb = mid + 1;
            }else{
                ub = mid;
            }
        }

        return index;
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

        System.out.println("Enter the element to search: ");        
        int x = sc.nextInt();
        BinarySearch bs = new BinarySearch();
        int ans = bs.searchElement(arr, x);
        if (ans != -1) {
            System.out.println("\nElement is present at index " + ans);
        } else {
            System.out.println("\nElement is not present");
        }

    }
}