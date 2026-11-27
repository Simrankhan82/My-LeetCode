class Solution {
    public int largestAltitude(int[] gain) {

        int altitude = 0 ; 
        int maxAlti = 0 ;
        for(int i = 0 ; i < gain.length ; i++){

            altitude += gain[i] ;
             maxAlti = Math.max( maxAlti ,altitude );
            
        }
        return maxAlti ;
    }
}




