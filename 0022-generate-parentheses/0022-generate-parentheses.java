class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        Backtrack(n , 0 , 0 ,"" , result);
        return result ;

    }
    public static void Backtrack(int n , int open , int close , String current , List<String> result){

        if(current.length() == 2*n){
            result.add(current);
            return ;
        }

        if(open < n ){

            Backtrack(n , open +1 , close , current +"(" , result);

        }
        if(close < open ){
            Backtrack(n , open , close+1 , current+")" , result);

        }

    }
}





  