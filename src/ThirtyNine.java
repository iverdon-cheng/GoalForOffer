/**
 * @author iverdon
 * @date 2020/9/15 16:41
 */
public class ThirtyNine {

    public int MoreThanHalfNum_Solution(int [] array) {
        int majority = array[0];
        for (int i = 1, cnt = 1; i<array.length; i++){
            cnt = majority == array[i] ? cnt+1 : cnt-1;
            if (cnt == 0){
                majority = array[i];
                cnt = 1;
            }
        }
        int cnt = 0;
        for (int val : array){
            if (val == majority){
                cnt++;
            }
        }
        return cnt > array.length/2? majority:0;
    }
}
