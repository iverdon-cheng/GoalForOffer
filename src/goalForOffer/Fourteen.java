package goalForOffer;

/**
 * @author iverdon
 * @date 2020/9/2 16:46
 */
public class Fourteen {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i=2; i<=n; i++){
            for (int j =1; j<i; j++){
                dp[i] = Math.max(dp[i],dp[j]*dp[i-j]);
            }
        }
        return dp[n];
    }
}
