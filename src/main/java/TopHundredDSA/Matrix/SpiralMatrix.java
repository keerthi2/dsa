package TopHundredDSA.Matrix;

import java.util.ArrayList;


public class SpiralMatrix {
    //https://www.geeksforgeeks.org/dsa/print-a-given-matrix-in-spiral-form/
    void main() {
        int[][] matrix = {{1, 2, 3, 4, 5},
                {5, 6, 7, 8, 6},
                {9, 10, 11, 12, 7},
                {13, 14, 15, 16, 8},
                {20, 21, 22, 23, 24}};
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        ArrayList<Integer> response = new ArrayList<>();
        for (int i = 0; i < matrix.length / 2; i++) {
            System.out.println(i);
            generateSpiral(matrix, top, bottom, left, right, response);
            top++;
            left++;
            right--;
            bottom--;
        }
        System.out.println(response);
    }

    public void generateSpiral(int[][] matrix, int top, int bottom, int left, int right, ArrayList<Integer> response) {
        for (int i = left; i <= right; i++) {
            response.add(matrix[top][i]);
        }
        for (int j = top + 1; j <= bottom; j++) {
            response.add(matrix[j][right]);
        }
        for (int k = right - 1; k >= left; k--) {
            response.add(matrix[bottom][k]);
        }
        for (int l = bottom - 1; l > top; l--) {
            response.add(matrix[l][left]);
        }

    }

}
