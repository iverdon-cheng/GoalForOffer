package goalForOffer;

import java.util.Stack;

/**
 * @author iverdon
 * @date 2020/9/4 16:05
 */
public class Thirty {
    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int node) {
        dataStack.push(node);
        minStack.push(minStack.isEmpty()?node:Math.min(node,minStack.peek()));
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
