package goalForOffer;

public class Two {
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0){
            return false;
        }
        int rows = 0, column = array[0].length-1;
        while (rows<array.length && column>=0){
            if (target == array[rows][column]){
                return true;
            }else if (target > array[rows][column]){
                rows++;
            }else {
                column--;
            }
        }
        return false;
    }
}
