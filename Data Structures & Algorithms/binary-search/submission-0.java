class Solution {
    public int search(int[] nums, int target) {
        int max=nums.length-1;//8
        int min=0;//-1

        while(min<=max){
            int middel=min+(max-min)/2;//3

            if(nums[middel]==target){
                return middel;
            }
            else if(nums[middel]>target){
                max=middel-1;
            }
            else if(nums[middel]<target){
                min=middel+1;
            }
            
        }

        return -1;
    }
}
