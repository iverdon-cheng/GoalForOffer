package classical;

import java.util.Scanner;

/**
 * @author iverdon
 * @date 2020/9/14 11:25
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cols = in.nextInt();
        int column = in.nextInt();
        int[][] matrix =new int[cols][column];
        int left = 0, right = column-1, top = 0, bottom = cols-1;
        int num = 1;
        while (left <= right && top <= bottom){
            for (int i = left; i<=right; i++){
                matrix[top][i] = num++;
            }
            for (int i = top+1; i<=bottom; i++){
                matrix[i][right] = num++;
            }
            if (left < right && top<bottom){
                for (int i = right-1; i>left; i--){
                    matrix[bottom][i] = num++;
                }
                for (int i = bottom; i>top; i--){
                    matrix[i][left] = num++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }
    }
}
