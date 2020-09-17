package goalForOffer;
import java.util.BitSet;

/**
 * @author iverdon
 * @date 2020/9/17 11:27
 */
public class Fifty {

    public int FirstNotRepeatingChar(String str) {
        BitSet bs1 = new BitSet(256);
        BitSet bs2 = new BitSet(256);
        for (char c : str.toCharArray()){
            if (!bs1.get(c) && !bs2.get(c)){
                bs1.set(c);
            }else if (bs1.get(c) && !bs2.get(c)){
                bs2.set(c);
            }
        }
        for (int i =0; i<str.length(); i++){
            if (bs1.get(str.charAt(i)) && !bs2.get(str.charAt(i))){
                return i;
            }
        }
        return -1;
    }

}
