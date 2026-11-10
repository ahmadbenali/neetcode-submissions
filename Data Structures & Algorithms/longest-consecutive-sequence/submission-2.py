class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        maximum=0
        newNums=set(nums)
        
        for num in nums:
            count=0
            if num-1 not in newNums:
                nextValue=0
                while num + nextValue in newNums:
                    count+=1
                    nextValue+=1
            if maximum < count:
                maximum=count
        return maximum


           
        