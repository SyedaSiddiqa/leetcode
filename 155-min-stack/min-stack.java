import java.util.Stack;

class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push operation
    public void push(int val) {
        mainStack.push(val);
        // Push to minStack only if val is smaller or equal
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop operation
    public void pop() {
        int removed = mainStack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    // Top element
    public int top() {
        return mainStack.peek();
    }

    // Minimum element
    public int getMin() {
        return minStack.peek();
    }
}
