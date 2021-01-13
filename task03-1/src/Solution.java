/**
 * @author Kylin
 * @version v1.0
 * @project LeetCode21
 * @date 2021/1/13
 */
public class Solution {
    public static int maxArea(int[] height) {
        int size = height.length;
        int left =0;
        int right=size-1;
        int area = 0;
        while (left<right){
            int result = (right-left)*Math.min(height[left],height[right]);
            if (height[left]>height[right]){
                right--;
            }else {
                left++;
            }
            if (area<result){
                area = result;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] height ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
