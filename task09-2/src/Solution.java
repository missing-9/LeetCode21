import java.util.ArrayList;
import java.util.List;

/**
 * @author Kylin
 * @version v1.0
 * @project LeetCode21
 * @date 2021/1/20
 */
public class Solution {
    public static List<Integer> grayCode(int n) {
        List<Integer> gray = new ArrayList<Integer>();
        for(int binary = 0;binary < 1 << n; binary++){
            gray.add(binary ^ binary >> 1);
        }
        return gray;
    }

    public static void main(String[] args) {
        grayCode(3);
    }
}
