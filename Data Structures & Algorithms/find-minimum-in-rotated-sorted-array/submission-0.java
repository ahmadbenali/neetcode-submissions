class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        

        while(left<right){
            int min=left+(right-left)/2;


            if(nums[min]>nums[right])
                left=min+1;
            else right=min;

            
        }
        return nums[left];
    }
}
