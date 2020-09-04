/**
 * @author iverdon
 * @date 2020/9/2 16:05
 */
public class Thirteen {
    private static final int[][] next = {{0,1},{0,-1},{1,0},{-1,0}};
    private int rows;
    private int cols;
    private int threshold;
    private int cnt = 0;
    private int[][] digitSum;

    public int movingCount(int threshold, int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        initDigitSum();
        boolean[][] marked = new boolean[rows][cols];
        dfs(marked,0,0);
        return cnt;
    }

    private void dfs(boolean[][] marked, int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || marked[r][c] ){
            return;
        }
        marked[r][c] = true;
        if (this.digitSum[r][c] > this.threshold){
            return;
        }
        cnt++;
        for (int[] n : next){
            dfs(marked,r+n[0], c+n[1]);
        }
    }

    private void initDigitSum() {
        int[] digitOne = new int[Math.max(rows,cols)];
        for (int i=0; i<digitOne.length; i++){
            int n = i;
            while (n > 0){
                digitOne[i] += n%10;
                n/=10;
            }
        }
        this.digitSum = new int[rows][cols];
        for (int i=0; i<this.rows; i++){
            for (int j=0; j<cols; j++){
                this.digitSum[i][j] = digitOne[i]+digitOne[j];
            }
        }
    }
}
