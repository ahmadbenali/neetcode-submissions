class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;

        for(int i=0;i<len;i++){
            int second=target-nums[i];
            for(int j=0;j<len;j++){
                if(second==nums[j] && j!=i)
                    return new int[]{i,j};
            }
        }
        return new int[0];
    }
}
