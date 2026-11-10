class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        ha={}

        for i in range(len(numbers)):
             ha[numbers[i]]=i+1
        

        for i in ha:
             tt=target-i
             if tt in ha:
                 return [ha[i],ha[tt]]
