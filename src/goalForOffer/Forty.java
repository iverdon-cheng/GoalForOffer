package goalForOffer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author iverdon
 * @date 2020/9/15 17:26
 */
public class Forty {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (k>input.length || k<=0){
            return new ArrayList<>();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(((o1, o2) -> o2-o1));
        for (int val : input){
            maxHeap.add(val);
            if (maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return new ArrayList<>(maxHeap);
    }
}
