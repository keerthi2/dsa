package TopHundredDSA.Matrix;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/dsa/search-a-word-in-a-2d-grid-of-characters/
public class WordSearchIn2Dimention {

    void main() {
        /*char[][] grid = {{'a', 'b', 'a', 'b' },
                {'a', 'b', 'e', 'b' },
                {'e', 'b', 'e', 'b' }};*/
        char[][] grid1 = {{'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                {'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                {'I', 'D', 'E', 'Q', 'A', 'S', 'C', 'V', 'E', 'E', 'K', 'S', 'S' },};
        String word = "GEEKS";
        exist(grid1, word);
    }

    public ArrayList<int[]> exist(char[][] matrix, String word) {
        ArrayList<int[]> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (search(matrix, word, i, j)) {
                    result.add(new int[]{i, j});
                }
            }
        }

        return result;
    }

    public boolean search(char[][] matrix, String word, int row, int col) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rowStright = row;
        int colStright = col;
        String temp = "";

        while (rowStright < matrix.length && colStright < matrix[0].length) {
            temp += matrix[rowStright][colStright];
            if (!word.substring(0, temp.length()).equalsIgnoreCase(temp)) {
                break;
            } else if (temp.equalsIgnoreCase(word) || new StringBuffer(temp).reverse().toString().equalsIgnoreCase(word)) {
                return true;
            }
            colStright++;
        }
        int rowDown = row;
        int colDown = col;
        temp = "";
        while (rowDown < matrix.length && colDown < matrix[0].length) {
            temp += matrix[rowDown][colDown];
            if (!word.substring(0, temp.length()).equalsIgnoreCase(temp.toString())) {
                break;
            } else if (temp.equalsIgnoreCase(word) || new StringBuffer(temp).reverse().toString().equalsIgnoreCase(word)) {
                return true;
            }
            rowDown++;
        }

        temp = "";
        while (row < matrix.length && col < matrix[0].length) {
            temp += matrix[row][col];
            if (!word.substring(0, temp.length()).equalsIgnoreCase(temp.toString())) {
                break;
            } else if (temp.equalsIgnoreCase(word) || new StringBuffer(temp).reverse().toString().equalsIgnoreCase(word)) {
                return true;
            }
            row++;
            col++;
        }

        return false;
    }


}
