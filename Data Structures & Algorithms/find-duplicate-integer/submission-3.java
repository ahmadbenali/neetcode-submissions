class Solution {
    public int findDuplicate(int[] nums) {

        Set<Integer> seen=new HashSet<>();

        int len=nums.length;

        for(int i=0;i<len;i++){
            if(!seen.add(nums[i])) return nums[i];
        }
        return -1;

        
        
    }
}
