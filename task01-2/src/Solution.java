/**
 * @author Kylin
 * @version v1.0
 * @project leetcode21
 * @date 2021/1/10 0010
 */
public class Solution {
    public static String longest(String string) {
        int length = string.length();
        boolean[][] dp = new boolean[length][length];
        int size = 1;
        String result = "";
        if (length == 1){
            return string;
        }
        if (length == 2){
            if (string.charAt(0)==string.charAt(1)){
                return string;
            }else {
                return String.valueOf(string.charAt(0));
            }
        }
        for (int i = 0; i < length; i++){
            for (int j = i+1; j < length; j++) {
                if (string.charAt(i)!=string.charAt(j)){
                    continue;
                }
                if (dp[i+1][j-1]&&j-i+1>=size){
                    dp[i][j] = true;
                    result = string.substring(i,j);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String string = "hgabcbadeedabcefahhafe";
        System.out.println(longest(string));
    }
}
