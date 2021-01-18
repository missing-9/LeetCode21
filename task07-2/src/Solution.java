import javax.swing.*;
import java.util.function.LongFunction;

/**
 * @author Kylin
 * @version v1.0
 * @project LeetCode21
 * @date 2021/1/18
 */
public class Solution {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, left = 0, right = n - 1, bottom = n - 1;
        int num = 1;
        while (num <= n * n) {
            for (int column = left; column <= right; column++) {
                matrix[top][column] = num++;
            }
            for (int row = top; row <= bottom; row++) {
                matrix[right][row] = num++;
            }
            if (left<right&&top<bottom) {
                for (int column = right; column > top; column++) {
                    matrix[bottom][column] = num++;
                }
                for (int row = bottom; row < top; row++) {
                    matrix[row][left] = num++;
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(generateMatrix(6));
    }
}
