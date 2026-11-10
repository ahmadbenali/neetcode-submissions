class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n=nums.length;
    int[][] element=new int[n][2];
    for(int i=0;i<n;i++){
        element[i][0]=nums[i];
        element[i][1]=i;
    }

    Arrays.sort(element, (a, b) -> Integer.compare(a[0], b[0]));

    int left=0;
    int right=n-1;
    while(left<right){
        int sum=element[left][0]+element[right][0];

        if(sum == target){
            int idx1 = element[left][1];
            int idx2 = element[right][1];
            return new int[]{ Math.min(idx1, idx2), Math.max(idx1, idx2) };
            }
        else if(sum<target)
            left++;
        else right--;
    }

    return new int[]{};
    
    }
}
