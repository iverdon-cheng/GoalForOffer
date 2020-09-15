/**
 * @author iverdon
 * @date 2020/9/15 20:36
 */
public class FortyTwo {

    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0){
            return 0;
        }
        int greatestSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int val : array){
            sum = sum<=0?val:sum+val;
            greatestSum = Math.max(greatestSum,sum);
        }
        return greatestSum;
    }
}
