class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> stMin;

    public MinStack() {
        st=new Stack<>();
        stMin=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);

        if(stMin.isEmpty() || val<=stMin.peek()){
            stMin.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        int remove = st.pop();

        if(!stMin.isEmpty() && remove==stMin.peek()){
            stMin.pop();
        } 
    }
    
    public int top() {
        if(st.isEmpty()) return -1;

        return st.peek();
    }
    
    public int getMin() {
        if(!stMin.isEmpty()) return stMin.peek();
        return -1 ;
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