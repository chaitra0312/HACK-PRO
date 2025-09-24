class Solution:
    def trap(self, height: List[int])-> int:
        n = len(height)
        if n == 0:
            return 0
        leftMax = [0] *n
        rightMax = [0]*n
        leftMax[0] = height[0]
        for i in range(1,n):
            leftMax[i] = max(leftMax[i-1],heigth[i])
        rightmax[0] = height[0]
        for i in range(n-2,-1,-1):
            rightMax[i] = max(right[i+1],height[i])
        water = 0
        for i in range(n):
            water += min(leftMax[i],rightMx[i])-height[i]
        return water
    
