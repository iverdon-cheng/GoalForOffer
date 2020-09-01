public class Nine {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }
        int l=0, h=array.length-1;
        while (l<h){
            int m = l+(h-l)/2;
            if (array[m] == array[h] && array[l] == array[m]){
                return minNumber(array,l,h);
            }else if (array[m]<=array[h]){
                h = m;
            }else{
                l=m;
            }
        }
        return array[l];
    }

    private int minNumber(int[] array, int l, int h) {
        for (int i=l; i<h; i++){
            if (array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return array[l];
    }
}
