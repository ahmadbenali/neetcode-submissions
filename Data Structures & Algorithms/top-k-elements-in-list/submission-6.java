class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(k==0)return new int[0];

        Map<Integer,Integer> table=new HashMap<>();

        for(int x:nums){
            table.put(x,table.getOrDefault(x,0)+1);
        }  

        int[] result=new int[k];
        int max=0;
        int ke=0;

        while(k>0){
            for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > max) {
            max = value;
            result[k - 1] = key;
            ke=key;
            }
        }
        table.remove(ke);
        max=0;
        k--;
        }

        return result;
    }
}
