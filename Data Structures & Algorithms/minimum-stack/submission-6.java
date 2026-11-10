class MinStack {
    private int Top;
    private ArrayList<Integer> stack=new ArrayList<>();
    private ArrayList<Integer> minstack=new ArrayList<>();

    public MinStack() {
        Top=0;
    }
    
    public void push(int val) {
        stack.add(val);
   
        if (minstack.isEmpty() || val <= minstack.get(minstack.size() - 1)) {
            minstack.add(val);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;

        int topValue = stack.remove(stack.size() - 1);
    
        if (!minstack.isEmpty() && topValue == minstack.get(minstack.size() - 1)) {
            minstack.remove(minstack.size() - 1);
        }

    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        if(!minstack.isEmpty())
            return minstack.get(minstack.size()-1);
        else return 0;
    }
}