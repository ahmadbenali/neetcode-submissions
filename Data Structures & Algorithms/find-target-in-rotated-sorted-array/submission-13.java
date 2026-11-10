class Solution {
    public int search(int[] nums, int t) {
        if(nums==null || nums.length==0) return -1;
        
        int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid=left+(right-left)/2;

            if(nums[mid]>nums[right]) left=mid+1;
            else right=mid;
        }

        int pivot=left;

        left=0;
        right=nums.length-1;

        if(t>=nums[pivot] && t<=nums[right])
            left=pivot;
        else right=pivot-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==t) return mid;

            if(nums[mid]>t) right=mid-1;
            else left=mid+1;
        }

        return -1;
    }
}
