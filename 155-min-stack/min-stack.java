class MinStack {
 Stack<Long> st = new Stack<>();
 long min;
    public MinStack() {
        
    }
    
    public void push(int val) {
        long x = val;
        if(st.size() == 0) {
            st.push(x);
            min = x;
            return;
        }
       if(x >= min) {
         st.push(x);
       } else {
         st.push(2*x-min);
         min = x;
       }
    }
    
    public void pop() {
       if(st.size() == 0) return;

        long top = st.pop();

        if(top < min) {
            min = 2 * min - top;
        }
    }
    
    public int top() {
        
        if(st.size() == 0) return -1;

        if(st.peek() >= min) {
            return st.peek().intValue();
        }

        return (int)min;
       
    }
    
    public int getMin() {
         if(st.size() == 0) return -1;
        return (int)min;  
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */