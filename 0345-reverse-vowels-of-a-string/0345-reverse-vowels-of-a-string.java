class Solution {
    public String reverseVowels(String s) {

        char [] c = s.toCharArray();

        int left = 0 ; 
        int right = c.length -1 ;

        while(left < right){

            while(left < right && !isVowels(c[left])){

                left++;      
            }
            while(left < right && !isVowels(c[right])){
                right--;

            }

            if(left < right){

            char temp  = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
            }
        }
            return new String(c);
        }
    
       

    public boolean isVowels(char ch){

        if(ch== 'a' || ch=='e' || ch == 'i'|| ch=='o' || ch == 'u' || ch== 'A' || ch == 'E'|| ch == 'I'|| ch == 'O' || ch== 'U'){

            return true ;
        }

        return false ;
    }
}


