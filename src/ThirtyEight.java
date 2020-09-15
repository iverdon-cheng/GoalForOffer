import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author iverdon
 * @date 2020/9/14 20:09
 */
public class ThirtyEight {

    private ArrayList<String> ret = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str.length()==0){
            return ret;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        backtracking(chars,new boolean[chars.length],new StringBuilder());
        return ret;
    }

    private void backtracking(char[] chars, boolean[] hasUsed, StringBuilder stringBuilder) {
        if (stringBuilder.length() == chars.length){
            ret.add(stringBuilder.toString());
            return;
        }
        for (int i =0; i<chars.length; i++){
            if (hasUsed[i]){
                continue;
            }
            if (i!=0 && chars[i] == chars[i-1] && !hasUsed[i-1]){
                continue;
            }
            hasUsed[i] = true;
            stringBuilder.append(chars[i]);
            backtracking(chars,hasUsed,stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            hasUsed[i] = false;
        }
    }
}
