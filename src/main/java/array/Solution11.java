package array;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.rmi.MarshalException;
import java.util.Arrays;

public class Solution11 {
    public void rotate(int[][] matrix) {
        folio(reverse(matrix));
    }

    public int[][] reverse(int[][] matrix) {
        int tmp;
        int length = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                tmp = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - j - 1] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
        printArr(matrix);
        return matrix;
    }

    public int[][] folio(int[][] matrix) {
        int tmp;
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                tmp = matrix[length - j - 1][length - i - 1];
                matrix[length - j - 1][length - i - 1] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
        printArr(matrix);
        return matrix;
    }

    public void printArr(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution11 so = new Solution11();
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        so.rotate(matrix);
    }


}
