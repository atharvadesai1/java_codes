
import java.util.*;


public class ThreeSum{
    public List<List<Integer>> calculateThreeSum(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Set<List<Integer>> answer = new HashSet<>(); 

        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                int currentSum = nums[i] + nums[j];
                int searchElement = -1*currentSum;
                if (hashMap.containsKey(searchElement)){
                    int elementIndex = hashMap.get(searchElement);
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[elementIndex]);
                    subList.add(nums[j]);
                    Collections.sort(subList);
                    answer.add(subList);
                }
                hashMap.put(nums[j], j);

            }
            hashMap.clear();
        }

        List<List<Integer>> finalAns = new ArrayList<>(answer);
        return finalAns;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println("Array : "+ Arrays.toString(nums));
        ThreeSum threesum = new ThreeSum();
        List<List<Integer>> finalAns = threesum.calculateThreeSum(nums);
        System.out.println("Answer : "+finalAns.toString());
    }
}