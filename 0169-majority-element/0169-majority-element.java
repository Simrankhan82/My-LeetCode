class Solution {
    public int majorityElement(int[] nums){

        HashMap<Integer , Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num ,mp.getOrDefault(num , 0) +1);

        }
        for(int key : mp.keySet()){
            if(mp.get(key) > nums.length/2){
                return key ;
                
            }

        }
        return -1 ;
    }
}


