class Solution {
    public int leastInterval(char[] tasks, int n) {
        int len=tasks.length;
        if(n==0) return len;

        int[] char_count=new int[26];
        for(int i=0;i<len;i++){
            char_count[tasks[i]-'A']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int x:char_count){
            if(x>0) maxHeap.offer(x);
        }

        Queue<int[]> coolingQueue = new LinkedList<>();

        int time=0;

        while(!maxHeap.isEmpty() || !coolingQueue.isEmpty()){
            time++;

            if(!coolingQueue.isEmpty() && coolingQueue.peek()[1]<=time)
                maxHeap.offer(coolingQueue.poll()[0]);
            

            if(!maxHeap.isEmpty()){
                int remainingCount=maxHeap.poll()-1;

                if(remainingCount>0){
                    coolingQueue.offer(new int[]{remainingCount,time+n+1});
                }
            }

            
        }
        return time;
    }
}
