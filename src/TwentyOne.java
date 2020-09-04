/**
 * @author iverdon
 * @date 2020/9/3 17:00
 */
public class TwentyOne {

    public void reOrderArray(int [] array) {
        int oddCnt = 0;
        for (int x : array){
            if (isEven(x)){
                oddCnt++;
            }
        }
        int[] copy = array.clone();
        int i = 0;
        for (int num : copy){
            if (num%2==1){
                array[i++] = num;
            }else {
                array[oddCnt++] = num;
            }
        }
    }

    private boolean isEven(int x) {
        if (x%2==1){
            return true;
        }
        return false;
    }
}
