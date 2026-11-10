class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        ha={key:0 for key in nums}

        for i in nums:
            ha[i]+=1

        result=[]

        while k>0:
            m=0
            s=0
            for i in ha:
                if ha[i]>m:
                    m=ha[i]
                    s=i
            result.append(s)
            ha.pop(s)
            k-=1
        
        return result

                

            
        

      


      
            
        