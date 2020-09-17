package goalForOffer;

import java.util.Arrays;

/**
 * @author iverdon
 * @date 2020/9/15 21:02
 */
public class FortyFive {

    public String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0){
            return "";
        }
        String[] nums = new String[numbers.length];
        for (int i =0; i<numbers.length; i++){
            nums[i] = numbers[i]+"";
        }
        Arrays.sort(nums,(s1,s2)->(s1+s2).compareTo(s2+s1));
        String ret = "";
        for (String s:nums){
            ret+=s;
        }
        return ret;
    }
}
