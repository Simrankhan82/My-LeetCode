class Solution {
    public int maxArea(int[] height){
        int l = 0 ; 
        int r = height.length -1;

        int MaxArea = 0;

        while(l<r){

        int h  = Math.min(height[l] , height[r]) ;
        int  Area = h * (r-l);
         MaxArea = Math.max(Area , MaxArea);
        


        

        if(height[l] < height[r]){
            l++;
        }

        else {
            r--;
        }
    }
         return  MaxArea;

    }
   
}


