class Solution:
    def maxArea(self, heights: List[int]) -> int:
        result =0


        lp=0
        rp=len(heights)-1

        while lp<rp:
            area=(rp-lp)*min(heights[lp],heights[rp])

            result=max(result,area)

            if heights[lp]<heights[rp]:
                lp+=1
            elif heights[rp]<heights[lp]:
                rp-=1
            else: rp-=1 # you can do lp+=1 because they are equal
        return result
        