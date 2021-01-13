import java.util.HashSet;
import java.util.Set;

/**
 * @author Kylin
 * @version v1.0
 * @project LeetCode21
 * @date 2021/1/14
 */
public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Set<Integer> list = new HashSet<>();
//        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    list.add(nums[i]+nums[j]+nums[k]);
                    System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                }
            }
        }
        System.out.println(list+"\n");
        int result = 999999;
        int cha = 99999;
        for (Integer integer : list) {
            int tempcha = Math.abs(integer-target);
//            cha = cha;
            System.out.println(tempcha);
            if (tempcha<=cha){
                cha = tempcha;
                result = integer;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println("\n\n"+threeSumClosest(nums, target));
    }
}
