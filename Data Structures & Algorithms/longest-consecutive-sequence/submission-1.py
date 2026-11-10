class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        lon=0

        for i in nums:
            if i-1 not in nums:
                length=0
                while i+length in nums:
                    length+=1
                lon=max(length,lon)
        return lon
        
        