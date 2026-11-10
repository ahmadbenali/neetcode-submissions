class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length=len(nums)
        result=[1]*length
                
        #prefix
        for i in range(length):
            if(i==0):
                result[i]=1
            else:
                result[i]=nums[i-1]*result[i-1]
        #suffix
        suffix=1
        for i in range(length-1 , -1 , -1):
            if(i!=length-1):
                suffix*=nums[i+1]
                result[i]*=suffix
        
        return result




                
