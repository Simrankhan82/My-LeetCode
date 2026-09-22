class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        BackTrack(s , 0 , path ,result );
        return  result ;



    }
    public  void BackTrack(String s , int start , List<String> path ,  List<List<String>> result ){

        if(start == s.length()){
            result.add(new ArrayList<>(path));
            return  ;


        }
        for(int end = start ; end  < s.length() ; end++){

            String part = s.substring(start , end+1);

           if(isPalindrom(part)){
                path.add(part);
                BackTrack(s , end+1 , path , result);
                path.remove(path.size()-1);

           }      

        }
    }
    public boolean isPalindrom(String s){
        int left = 0 ; 
        int right = s.length()-1;

        while(left<right){

        if(s.charAt(left) != s.charAt(right)){
            return false;
        }

            left++;
            right-- ;

        }
        return true ;

    }

}


    









        


    
