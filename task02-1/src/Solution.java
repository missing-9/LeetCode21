import java.util.ArrayList;
import java.util.List;

/**
 * @author Kylin
 * @version v1.0
 * @project LeetCode21
 * @date 2021/1/13
 */
public class Solution {
    public int reverse(int x) {
        String value = String.valueOf(x);
        String result = "";
        if (x < 0) {
            result = "" + "-";
            value = value.substring(1);
        }
        List<String> list = new ArrayList<>();
        int size = value.length() - 1;
        for (int i = size; i > -1; i--) {
            list.add(size - i, String.valueOf(value.charAt(i)));
        }
        if ("0".equals(list.get(0))) {
            list.remove(0);
        }
        for (String s : list) {
            result+=s;
        }
        try{
            return "".equals(result)?0:Integer.valueOf(result);
        }catch(Exception e){
            return 0;
        }
    }
}
