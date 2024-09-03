import java.util.*;

class Tt{
    public static void main(String[] args){
        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(10);    
        // numbers.add(20);   
        // numbers.add(30);   
        // numbers.add(40);    
        // System.out.println(numbers);
        // // Add an element at a specific index
        // numbers.add(2, 25); // Adds 25 at index 2, shifting elements right
        // System.out.println(numbers);

        // // Remove an element by index
        // numbers.remove(3);  // Removes the element at index 3 (was 30)
        // System.out.println(numbers);

        // // Remove an element by value
        // numbers.remove(Integer.valueOf(25)); // Removes the first occurrence of 25
        // System.out.println(numbers);

        // // Get the index of a specific element
        // int index = numbers.indexOf(20); // Returns the index of 20 (should be 1)
        // System.out.println(numbers);
        // System.out.println("Index of 20: " + index);


        int[][] chana = new int[2][2];
        chana[0][0] = 5;
        chana[1][1] = 6;
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print(chana[i][j]);
            }
            System.out.println();
        }
    }
}