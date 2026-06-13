class MinStack {
    Stack<Long> st = new Stack<>();
    long min = -1;
    public MinStack() {
        
    }
    
    public void push(int value) {
        long x = (long)value;
        if(st.size() == 0) {
            st.push(x);
            min = x;
        }
        else if(x < min) {
            st.push(2*x-min);
            min = x;
        } else if(x >= min)
         st.push(x);
    }
    
    public void pop() {
        if(st.peek() > min) {
            st.pop();
        } else {
            long oldmin = 2*min - st.peek();
            min = oldmin;
            st.pop();
        }      
    }
    
    public int top() {
        if(st.size() == 0) return -1;
        long q = st.peek();
        if(q > min) {
            return (int)q;
        } else 
         return (int)min;
    }
    
    public int getMin() {
        return (int)min;
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