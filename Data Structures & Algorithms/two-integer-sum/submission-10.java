class Solution {
    public int[] twoSum(int[] nums, int target) {
    int len=nums.length;
    Map<Integer,Integer> hashmap=new HashMap<>();

    for(int i=0;i<len;i++){
        int x=target-nums[i];

        if(hashmap.containsKey(x))
            return new int[]{hashmap.get(x),i};
        else hashmap.put(nums[i],i);
    }
    return new int[0];

    }
}
