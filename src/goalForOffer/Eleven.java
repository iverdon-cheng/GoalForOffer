package goalForOffer;

/**
 * @author iverdon
 * @date 2020/9/2 14:59
 */
public class Eleven {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }
        int l = 0, h=array.length-1;
        while (l<h){
            int m = l+(h-l)/2;
            if (array[l] == array[m] && array[h] == array[m]){
                return finMin(array,l,h);
            }else if (array[m]<=array[h]){
                h=m;
            }else {
                l=m+1;
            }
        }
        return array[l];
    }

    private int finMin(int[] array, int l, int h) {
        int min = array[l];
        for (int i = l+1; i<=h; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
