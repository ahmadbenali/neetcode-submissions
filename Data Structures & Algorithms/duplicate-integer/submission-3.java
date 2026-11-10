class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            if(i==len-1)
                return false;
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
}