class Solution {
    public boolean isAnagram(String s, String t) {


    if(s.length() != t.length()){
        return false;

    }

    int[] freqS = new int[128];
    int[] freqT = new int[128];


    for(int i = 0 ; i < s.length() ; i++){
        freqS[s.charAt(i)]++ ;
    }
    for(int i =0 ; i < t.length() ; i++){
        freqT[t.charAt(i)]++;

    }

    for(int i = 0 ; i< 128 ; i++){
        if(freqS[i] != freqT[i]){
            return false ;
        }

        
    }
    return true ;
    }
}



    

