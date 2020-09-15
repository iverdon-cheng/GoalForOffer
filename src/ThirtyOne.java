import java.util.Stack;

/**
 * @author iverdon
 * @date 2020/9/4 16:53
 */
public class ThirtyOne {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int n = popA.length;
        Stack<Integer> stack = new Stack<>();
        for (int pushIndex=0, popIndex=0; pushIndex<n; pushIndex++){
            stack.push(pushA[pushIndex]);
            while (popIndex < n && popA[popIndex] == stack.peek() && !stack.isEmpty()){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
