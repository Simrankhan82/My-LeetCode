class Solution {
    public int maxVowels(String s, int k) {

        int count = 0 ; 
        int maxCount = 0 ;
        
        for(int i = 0 ; i < k ; i++){

            if(isVowels(s.charAt(i))){
                count++;
            }
            maxCount = count ;
        }
        for(int i =  k ; i < s.length() ; i++){
            char outgoing = s.charAt(i-k);
            if(isVowels(outgoing)){
                count--;
            }
            char incoming = s.charAt(i);
            if(isVowels(incoming)){
                count++;
            }
            maxCount = Math.max(count , maxCount);

        }
        return maxCount ;


    }
    public boolean isVowels(char c ){

        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}