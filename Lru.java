import java.util.*;

class Lru{
    static int m = 4;
    static int n = 20;
    static int[][] frame = new int[n][m];
    static int faults = 0;
    static int hits = 0;

    public static boolean checkIfElementPresent(int i, int word){
        for(int k=0; k<m; k++){
            if(word == frame[i][k]){
                return true;
            }
        }
        return false;
    }

    public static int checkIndexToReplace(int i, int[] elements){
        int count = 0;
        ArrayList<Integer> visited = new ArrayList<>();
        for (int k=0; k<m; k++){
            if(frame[i][k] == elements[i]){
                hits++;
                return -1;
            }
        }
        int recentElement = -999;
        int index = -999;
        for (int j=i-1; j>=0; j--){
            if (visited.contains(elements[j])){
                continue;
            }
            boolean crosscheck = checkIfElementPresent(i, elements[j]); 
            if (crosscheck){
                visited.add(elements[j]);
                count++;
                if (count == m){
                    recentElement = elements[j];
                    break;
                }
            }
        }

        for (int k=0; k<m; k++){
            if(frame[i][k] == recentElement){
                index = k;
                break;
            }
        }
        faults++;
        return index;
    }


    public static void main(String[] args){
        int[] elements = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1}; 
        for (int i=0; i<m; i++){
            if(i == 0){
                frame[i][i] = elements[i];
                faults++;
                continue;
            }
            for (int j=0; j<m; j++){
                frame[i][j] = frame[i-1][j];
            }
            frame[i][i] = elements[i];
            faults++;
        }

  

        // for the remaining elements;
        for (int i=m; i<n; i++){
            for (int k=0; k<m; k++){
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
        System.out.println("*****************PAGE SEGMENTATION USING LRU*****************\n");
        System.out.println("\nTotal Faults: " + faults);
        System.out.println("Total Hits: "+ hits);
        for (int i = 0; i < n; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m; j++) {
                System.out.print(frame[i][j] + " ");
            }
            System.out.println("]");
        }


    }
}

//7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1