import java.util.*;

class Lfu{
    static int m = 3;
    static int n = 15;
    static HashMap<Integer, Integer> frequency = new HashMap<>();
    static ArrayList<Integer> queue = new ArrayList<>();
    static int[][] frame = new int[n][m];

    public static int findIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; 
    }

    public static int whoCameFirst(ArrayList<Integer> bucket){
        for (int i=0; i<queue.size(); i++){
            if (bucket.contains(queue.get(i))) {
                return queue.get(i);
            }
        }
        return 0;
    }

    public static int indexToReplace(int i, int[] elements){
        ArrayList<Integer> bucket = new ArrayList<>();
        for (int k=0; k<m; k++){
            if (frame[i][k] == elements[i]){
                frequency.put(elements[i], frequency.getOrDefault(elements[i], 0)+1);
                return -1;
            }
        }

        int lowestValue = 999;
        int lowestElement = 999;
        for (Integer key : frequency.keySet()) {
            if(frequency.get(key) < lowestValue){
                lowestValue = frequency.get(key);
                lowestElement = key;
                bucket.clear();
            }
            else if(frequency.get(key) == lowestValue){
                if(!bucket.contains(lowestElement)){
                    bucket.add(lowestElement);
                }
                bucket.add(key);
            }
        }

        if(bucket.size() == 0){
            queue.remove(Integer.valueOf(lowestElement));
            frequency.remove(lowestElement);
            int index = findIndex(frame[i], lowestElement);
            return index;
        }
        else{
            lowestElement = whoCameFirst(bucket);
            queue.remove(Integer.valueOf(lowestElement));
            frequency.remove(lowestElement);
            int index = findIndex(frame[i], lowestElement);
            return index;
        }
    }

    public static void main (String[] args) {
        int faults = 0;
        int hits = 0;
        int[] elements = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2};
        // System.out.println();
        // Here I am adding the first three value to the frame and updating the frequency hash
        for (int i=0; i<m; i++){
            if(i == 0){
                frame[i][0] = elements[i];
                frequency.put(elements[i], 1);
                queue.add(elements[i]);
                faults++;
                continue;
            }

            for (int j=0; j<m; j++){
                frame[i][j] = frame[i-1][j];
            }
            frame[i][i] = elements[i];
            frequency.put(elements[i], 1);
            queue.add(elements[i]);
            faults++;
        }

        for (int i=m; i<n; i++){
            frame[i][0] = frame[i-1][0];
            frame[i][1] = frame[i-1][1];
            frame[i][2] = frame[i-1][2];
            int checkStatus = indexToReplace(i, elements);
            if(checkStatus == -1){
                hits++;
                continue;
            }
            else{
                frame[i][checkStatus] = elements[i];
                queue.add(elements[i]);
                frequency.put(elements[i], 1);
                faults++;
            }
        }

        System.out.println("*****************PAGE SEGMENTATION USING LFU*****************\n");
        System.out.println("\nFaults "+ faults);
        System.out.println("Hits "+ hits);
        //printing final frame answer:
        for (int i = 0; i < frame.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m; j++) {
                System.out.print(frame[i][j] + " ");
            }
            System.out.println("]");
        }


    }
}
