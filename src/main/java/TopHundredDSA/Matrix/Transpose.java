package TopHundredDSA.Matrix;

import java.util.Arrays;

// reference : https://www.geeksforgeeks.org/dsa/program-to-find-transpose-of-a-matrix/
public class Transpose {
    void main() {
        int[][] data1 = {{1, 2, 3, 4, 5},
                {5, 6, 7, 8, 6},
                {9, 10, 11, 12, 7},
                {13, 14, 15, 16, 8},
                {20, 21, 22, 23, 24}};
    //    int[][] data = {{1, 2}, {9, -2}};
        transpose(data1);
        System.out.println(Arrays.deepToString(data1));

    }

    //Optimised solution just traversing only once
    public void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

    }

}
