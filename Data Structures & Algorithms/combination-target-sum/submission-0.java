class Solution {
    List<List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();

        Backtracking(nums,0,target,current);
        return result;
        
    }

    public void Backtracking(int[] nums, int i, 
    int target, List<Integer> current){
        
        if(target==0){
            result.add(new ArrayList(current));
            return;
        }
        if(target<0 || i>=nums.length)
        return;

        current.add(nums[i]);
        Backtracking(nums,i,target-nums[i],current);
        current.remove(current.size()-1);
        Backtracking(nums,i+1,target,current);

    }
}
