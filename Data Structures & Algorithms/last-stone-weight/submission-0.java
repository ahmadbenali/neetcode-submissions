class Solution {
    public int lastStoneWeight(int[] stones) {
        
        if(stones.length==1) return stones[0];

        PriorityQueue<Integer> big=new PriorityQueue<>();
        
        int[] st=new int[stones.length-1];

        for(int i=0;i<stones.length;i++){
            big.offer(stones[i]);

            if(big.size()>2)
                st[i-2]=big.poll();
        }
        int x=big.poll();
        int y=big.poll();
        if(x<y) 
            st[st.length-1]=y-x;

        return lastStoneWeight(st);
    }
}
