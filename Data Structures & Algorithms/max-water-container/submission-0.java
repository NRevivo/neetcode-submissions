class Solution {
    public int maxArea(int[] heights) {
        int max = 0;

        for (int i = 0; i < heights.length - 1; i++){
            for (int j = i + 1; j < heights.length; j++){
                int high = Math.min(heights[i], heights[j]);
                if (((j - i) * high) > max){
                    max = (j - i) * high;
                }
                
            }
        }
        return max;
        
    }
}
