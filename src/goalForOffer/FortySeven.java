package goalForOffer;

/**
 * @author iverdon
 * @date 2020/9/16 23:41
 */
public class FortySeven {
    public int getMost(int[][] values) {
        if (values == null || values.length == 0 || values[0].length == 0){
            return 0;
        }
        int[] dp = new int[values[0].length];
        for (int[] value : values){
            dp[0] += value[0];
            for (int i = 1; i<value.length; i++){
                dp[i] = Math.max(dp[i],dp[i-1])+value[i];
            }
        }
        return dp[dp.length-1];
    }
}
