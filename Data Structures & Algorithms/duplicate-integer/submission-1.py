class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        '''
        list=[]
        for i in nums:
            if i not in list:
                list.append(i)
        if len(list)!=len(nums):
            return True
        else: return False
        '''
        ha={key:0 for key in nums}

        for i in nums:
            ha[i]=ha[i]+1
            if ha[i]>=2:
                return True
        return False
        

         