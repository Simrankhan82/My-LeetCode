class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        Backtrack(n , 0 , 0 ,"" , result);
        return  result ;

    }

    public static void Backtrack(int n , int open , int close  , String  Current , List<String> result){

        if(Current.length() == 2*n){
            result.add(Current);
            return ;
        }

        if(open < n){

            Backtrack( n , open+1 , close , Current+"("  ,result);
        
        }

        if(close < open){

            Backtrack(n, open , close+1 , Current+")" , result);
        }

    }
}
