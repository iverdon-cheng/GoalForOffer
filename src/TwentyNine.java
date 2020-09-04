import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author iverdon
 * @date 2020/9/4 14:37
 */
public class TwentyNine {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix == null){
            return null;
        }
        int top = 0;
        int bottom = matrix.length;
        int left = 0;
        int right = matrix[0].length;
        ArrayList<Integer> head = new ArrayList<>();
        while (top != bottom && left!=right){
            for (int i=left; i<right; i++){
                head.add(matrix[top][i]);
            }
            top++;
            if ( top == bottom){
                return head;
            }
            for (int i=top; i<bottom; i++){
                head.add(matrix[i][right-1]);
            }
            right--;
            if (left == right){
                return head;
            }
            for (int i=right-1; i>=left; i--){
                head.add(matrix[bottom-1][i]);
            }
            bottom--;
            if ( top == bottom){
                return head;
            }
            for (int i = bottom-1; i>=top; i--){
                head.add(matrix[left][i]);
            }
            left++;
            if ( left == right){
                return head;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        TwentyNine s = new TwentyNine();
        System.out.println(s.printMatrix(matrix).toString());
    }
}
