class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> current = new  ArrayList<>();

        backtrack(candidates , target , 0, current , list );
        return list ;



    }


    public void backtrack(int[] candidates , int target ,  int index ,  List<Integer>current ,List<List<Integer>> list ){

        //base case 
        if(target == 0 ){
            list.add(new ArrayList<>(current));
            return ;

        }

        
        for(int i = index ; i < candidates.length ; i++){
            if (candidates[i] > target) {
            break;
            }
            
            if(i > index && candidates[i] == candidates[i-1]){
                continue ;

            }

            // take 

            current.add(candidates[i]);
            backtrack(candidates , target - candidates[i] ,i+1, current, list);

            // not take 
            current.remove(current.size()-1);
           
        }
    }
}




































