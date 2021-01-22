/**
 * @author Kylin
 * @version v1.0
 * @project leetcode21
 * @date 2021/1/22 0022
 */
public class Solution {
    public static int maxProfit(int[] prices) {
        if (prices==null || prices.length==0) return 0;
        int result=0;
        int min=prices[0];
        for (int i=1;i<prices.length;i++){
            result=(result>prices[i]-min)? result:prices[i]-min;
            min=(prices[i]<min)? prices[i]:min;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
