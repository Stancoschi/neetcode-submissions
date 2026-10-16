class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1, max = 0, sum = 0;

        while (l < r) {
            if (heights[l] >= heights[r]) {
                sum = heights[r] * (r - l);
                r--;
            }
            else{  
                sum = heights[l] * (r-l);
                l++;
            }
            if (sum > max) {
                max = sum;
            }

            
        }
        return max;
    }
}
