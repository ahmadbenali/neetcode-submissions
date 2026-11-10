class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(candidates);
    
        Backtracking(candidates,0,target,curr);
        return result;
    }

    public void Backtracking(int[] candidates, int i,
     int target, List<Integer> curr){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0 || i==candidates.length)
            return;
        
        curr.add(candidates[i]);
        Backtracking(candidates,i+1,target-candidates[i],curr);
        curr.remove(curr.size()-1);

        while(i+1<candidates.length && candidates[i]==candidates[i+1])
            i+=1;
        Backtracking(candidates, i+1, target, curr);
        
     }
}
