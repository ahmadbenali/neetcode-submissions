class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # total=1
        # totaltemp=1
        # # problem with total when it's zero 
        # # prefix & suffix  

        # for i in nums:
        #     if i == 0:
        #         totaltemp=total
        #         total*=i
        #     else:
        #         total*=i

        # result=[]
        # for i in range(len(nums)):
        #     if nums[i]!= 0:
        #         result.append(int(total/nums[i]))
        #     else:
        #         result.append(totaltemp)

        # return result
        n = len(nums)
        res = [1] * n

        prefix = 1
        for i in range(n):
            res[i] = prefix
            prefix *= nums[i]

        suffix = 1
        for i in range(n - 1, -1, -1):
            res[i] *= suffix
            suffix *= nums[i]

        return res
        
