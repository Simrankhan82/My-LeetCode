class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0 ; 
        int maxlen =  0 ; 

        HashSet<Character> set = new HashSet<>();


        for(int right = 0 ; right < s.length() ; right++){
            
            char c = s.charAt(right);

            while(set.contains(c)){

                set.remove(s.charAt(left));
                left++;

            }
            set.add(c);

            int length = right - left +1 ;
             maxlen  = Math.max(length , maxlen);       
      

        }
        return maxlen ;
    }

}


