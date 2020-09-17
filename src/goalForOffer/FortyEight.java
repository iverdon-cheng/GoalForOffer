package goalForOffer;

import java.util.Arrays;

/**
 * @author iverdon
 * @date 2020/9/17 8:22
 */
public class FortyEight {
    public int longestSubStringWithoutDuplication(String str) {
        if (str == null || str.length() == 0){
            return 0;
        }
        int maxLen = 0;
        int curLen = 0;
        int[] preIndexes = new int[26];
        Arrays.fill(preIndexes,-1);
        for (int i =0; i<str.length(); i++){
            int c = str.charAt(i)-'a';
            int preL = preIndexes[c];
            if (preL == -1 || i-preL > curLen){
                curLen++;
            }else {
                maxLen = Math.max(maxLen,curLen);
                curLen = i-preL;
            }
            preIndexes[c] = i;
        }
        maxLen = Math.max(maxLen,curLen);
        return maxLen;
    }
}
