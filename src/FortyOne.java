import java.util.PriorityQueue;

/**
 * @author iverdon
 * @date 2020/9/15 19:41
 */
public class FortyOne {
    private PriorityQueue<Integer> left = new PriorityQueue<>(((o1, o2) -> o2-o1));
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    private int N = 0;

    public void Insert(Integer num) {
        if (N%2==0){
            left.add(num);
            right.add(left.poll());
        }else {
            right.add(num);
            left.add(right.poll());
        }
        N++;
    }

    public Double GetMedian() {
        if ( N%2 == 0 ){
            return (left.peek()+right.peek())/2.0;
        }
        return (double)right.peek();
    }
}
