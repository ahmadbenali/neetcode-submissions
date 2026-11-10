class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;

        for(int i=0;i<len;i++){
            int t=target-nums[i];
            for(int j=i+1;j<len;j++)
                if(nums[j]==t)
                    return new int[]{i,j};
        }

        return new int[]{};
    }
}
