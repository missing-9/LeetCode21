/**
 * @author Kylin
 * @version v1.0
 * @project LeetCode21
 * @date 2021/1/20
 */
public class Solution {
    public static int uniquePaths(int m, int n) {
        long result =1;
        if (m>=n){
            for (int i = (m+n-2); i > (m-1) ; i--) {
                result *=i;
                System.out.println(result);
            }
            return (int)(result/factorial(n-1));
        }else {
            for (int i = (m+n-2); i > (n-1) ; i--) {
                result *=i;
                System.out.println(result);
            }
            return (int)(result/factorial(m-1));
        }


    }

    public static long factorial(int n){
        int result=1;
        for (int i = 2; i <= n; i++) {
            result *=i;
        }
        System.out.println("==== "+result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(10,10    ));
    }
}
