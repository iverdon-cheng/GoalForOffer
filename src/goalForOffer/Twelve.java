package goalForOffer;

/**
 * @author iverdon
 * @date 2020/9/2 15:26
 */
public class Twelve {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        int[] status = new int[matrix.length];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                int index = i*cols+j;
                if (str[0] == matrix[index]){
                    if (backTracking(matrix,rows,cols,0,index,str,status)){
                        return true;
                    };
                }
            }
        }
        return false;
    }

    private boolean backTracking(char[] matrix, int rows, int cols, int num, int index, char[] str, int[] status) {
        if (num == str.length){
            return true;
        }
        if (index >= matrix.length || index<0 || status[index] == 1 || matrix[index] != str[num]){
            return false;
        }
        status[index] = 1;
        if (backTracking(matrix,rows,cols,num+1,index+1,str,status)
            || backTracking(matrix,rows,cols,num+1,index-1,str,status)
            || backTracking(matrix,rows,cols,num+1,index+cols,str,status)
            || backTracking(matrix,rows,cols,num+1,index-cols,str,status)){
            return true;
        }
        status[index] =0;
        return false;
    }
}
