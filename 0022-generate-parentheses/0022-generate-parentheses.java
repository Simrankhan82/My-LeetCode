class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        BackTrack(n , 0 , 0 , "", result);
        return result;

        
    }

    public static void BackTrack(int n , int open , int close ,String Current , List<String> result ){

        if(Current.length() == 2*n){
            result.add(Current);
            return ;
        }

        if(open < n){

            BackTrack(n , open+1 , close , Current+"("  , result);
        }

        if(close < open){

            BackTrack(n , open , close+1 , Current+")" , result);
        }
    }

}