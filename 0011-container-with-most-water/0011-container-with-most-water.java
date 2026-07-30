class Solution {
    public int maxArea(int[] height){
        int l =  0 ; 
        int r = height.length -1;
        int MaxArea = 0 ;
        
        while(l < r){
            
            
            int area  = Math.min(height[l] , height[r]) * (r  - l);
            MaxArea  = Math.max(area , MaxArea);


            if(height[l] < height[r]){

                l++;
            }
            else {
                r--;
            }
        }

            return MaxArea ;
        
    }
}