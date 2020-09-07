package goalForOffer;

/**
 * @author iverdon
 * @date 2020/9/2 16:52
 */
public class Fifteen {
    //n%(n-1)
    //该位运算去除n位级表示中最低的那一位
    public int NumOfOne(int n){
        int cnt = 0;
        if (n!=0){
            cnt++;
            n=n&(n-1);
        }
        return cnt;
    }
}
