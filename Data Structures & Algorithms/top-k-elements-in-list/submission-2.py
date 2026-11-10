class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic={}
        freq=[[]for i in range(len(nums)+1)]

        for i in nums:
            dic[i]=dic.get(i,0)+1
        
        for i ,j in dic.items():#i is the number \ j is the freq in nums
            freq[j].append(i)
        
        result=[]
        for i in range(len(freq)-1,0,-1):# start from zero and subtract it -1
            for j in freq[i]:
                result.append(j)
                if len(result)==k:
                    return result


      
            
        