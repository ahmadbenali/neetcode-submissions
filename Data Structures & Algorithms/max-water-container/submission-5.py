class Solution:
    def maxArea(self, heights: List[int]) -> int:

        canStore=len(heights)-1

        left=0
        right=canStore
        maximum = 0
        while left < right:

            container = min(heights[left],heights[right]) * (right-left)

            if container > maximum:
                maximum = container
            
            if heights[left] < heights[right] :
                left +=1
            else :
                right-=1
        
        return maximum

            