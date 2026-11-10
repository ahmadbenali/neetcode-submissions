class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int x;
    int length=nums.size();
    for (int i=0;i<length;i++)
    {
        x=-1*(nums[i]-target);//3
        for(int j=i+1;j<length;j++)
        {
            if(nums[j]==x)
            return {i,j};
        }

    }
    return {};
    }
};
