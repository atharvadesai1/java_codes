import java.util.*;

class Fifo{
    static int m = 15;
    static int n = 3;
    static int[][] frame = new int[m][n];
    static ArrayList<Integer> queue = new ArrayList<>();
    static int faults = 0;
    static int hits = 0;

    public static int checkIndexToReplace(int i, int[] elements){
        for (int k=0; k<n; k++){
            if(frame[i][k] == elements[i]){
                hits++;
                return -1;
            }
        }

        int index = -10;
        for (int k=0; k<n; k++){
            if(frame[i][k] == queue.get(0)){
                index = k;
                queue.remove(0);
                queue.add(elements[i]);
                break;
            }
        }
        faults++;
        return index;
    }

    public static void main(String[] args){
        int[] elements = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 1, 2, 0};
        for (int i=0; i<n; i++){
            if(i == 0){
                frame[i][i] = elements[i];
                queue.add(elements[i]);
                faults++;
                continue;
            }
            for (int j=0; j<i; j++){
                frame[i][j] = frame[i-1][j];
            }
            frame[i][i] = elements[i];
            queue.add(elements[i]);
            faults++;
        }

        for (int i=n; i<m; i++){
            for(int k=0; k<n; k++){
                frame[i][k] = frame[i-1][k];
            }

            int index = checkIndexToReplace(i, elements);
            if(index == -1){
                continue;
            }
            else{
                frame[i][index] = elements[i];
            }
        }
        
        //printing final frame answer:
        System.out.println("*****************PAGE SEGMENTATION USING FIFO*****************\n");
        System.out.println("\nTotal Faults: " + faults);
        System.out.println("Total Hits: "+ hits);
        for (int i = 0; i < frame.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < n; j++) {
                System.out.print(frame[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}


//7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 1, 2, 0