package goalForOffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author iverdon
 * @date 2020/9/15 20:16
 */
public class FortyOnePlus {
    private int[] cnt = new int[256];
    private Queue<Character> queue = new LinkedList<>();
    //Insert one char from stringstream
    public void Insert(char ch) {
        cnt[ch]++;
        queue.add(ch);
        while (!queue.isEmpty()&&cnt[queue.peek()]>1){
            queue.poll();
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        return queue.isEmpty()?'#':queue.peek();
    }
}
