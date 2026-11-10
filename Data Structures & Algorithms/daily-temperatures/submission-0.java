class Solution {
    public int[] dailyTemperatures(int[] temp) {
         Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> days = new ArrayList<>(Collections.nCopies(1, 0));

        for(int i=temp.length-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                int day=0;
                boolean flag=false;
                while(!stack.isEmpty()){
                    if(temp[i]<temp[stack.peek()]){
                        flag=true;
                        break;
                    }else {
                        stack.pop();
                    }
                }
                if(flag)days.add(0,stack.peek()-i);
                else days.add(0,0);
                stack.push(i);
            }
        }
        return days.stream().mapToInt(i -> i).toArray();
    }
}
