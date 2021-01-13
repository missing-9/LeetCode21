import java.util.*;
import java.util.stream.Collectors;

import static sun.plugin2.os.windows.FLASHWINFO.size;

/**
 * @author Kylin
 * @version v1.0
 * @project LeetCode21
 * @date 2021/1/14
 */
public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int size = 0;
        if (strs.length > 0) {
            Set<String> list = new HashSet<>();
//            List<String> list = new ArrayList<>();
            String data = strs[0];
            for (int i = 1; i <= data.length(); i++) {
                list.add(data.substring(0, i));
            }
            System.out.println(list);
            for (String s : list) {
                boolean ifPre = true;
                List<String> asList = Arrays.asList(strs);
                for (int i = 0; i < asList.size(); i++) {
                    if (asList.get(i).startsWith(s)) {
                        ifPre = true;
                    } else {
                        ifPre = false;
                        break;
                    }

                }
                if (ifPre && s.length() > size) {
                    result = s;
                    size = s.length();
                }
            }
        }
        return result;


    }

    public static void main(String[] args) {
        String[] strs = {"c","acc","ccc"};
        System.out.println(longestCommonPrefix(strs));
    }
}
