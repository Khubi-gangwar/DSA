class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        if(st.size() == 0 && minSt.size() == 0) {
            st.push(value);
            minSt.push(value);
        } else {
            st.push(value);
            if(minSt.peek() > value) {
                minSt.push(value);
            } else {
                 minSt.push(minSt.peek());
            }
        }
    }
    
    public void pop() {
        // if(st.size() > 0 && minSt.size() > 0) {
        st.pop();
        minSt.pop();
        // }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */