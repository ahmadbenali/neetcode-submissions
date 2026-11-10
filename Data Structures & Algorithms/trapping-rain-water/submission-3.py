class Solution:
    def trap(self, height: List[int]) -> int:
        # maxHeight = max(height)
        # lenght = len(height)
        # boxes = [[0] * lenght for _ in range(maxHeight)]

        # for row in range(maxHeight):
        #     for col in range(lenght):
        #         if(height[col] == 0 ):
        #             boxes[row][col] = 0
        #         else:
        #             boxes[row][col] = 1
        #             height[col]-=1
        # total=0
        # for row in range(maxHeight):
        #     for col in range(lenght): 
        #         if boxes[row][col] == 0:
        #             left_wall = any(boxes[row][l] == 1 for l in range(0, col))
        #             right_wall = any(boxes[row][r] == 1 for r in range(col + 1, lenght))
        #             if left_wall and right_wall:
        #                 total += 1
        # return total

        left,right = 0, len(height)-1
        maxleft, maxright = height[left], height[right]
        water = 0
        
        while left < right : 
            if maxleft < maxright:
                left+=1
                maxleft = max(maxleft, height[left])
                water+=maxleft-height[left]

            else:
                right-=1
                maxright = max(maxright, height[right])
                water+=maxright-height[right]
            
        return water


                

        
        

        