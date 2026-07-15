class Solution {
    public int gcdOfOddEvenSums(int n) {

        int SumOdd = n* n ; 
        int SumEven = n*(n+1);

        return gcd(SumOdd , SumEven);

        
    }

    public int gcd(int a  , int b){
        while(b!= 0){
            int temp = b ;
            b = a%b ;
            a = temp ;
        }

        return a ;
    }
}


