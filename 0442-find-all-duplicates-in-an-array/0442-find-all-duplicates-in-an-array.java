class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    HashMap<Integer , Integer> map = new HashMap<>();
    for(int i = 0 ; i < nums.length ; i++){
        map.put(nums[i] , map.getOrDefault(nums[i] , 0 )+1);
    }

    List<Integer> list = new ArrayList<>();
    for(int i = 0 ; i < nums.length ; i++){
        if(map.get(nums[i]) == 2){
            list.add(nums[i]);   
            
        }
        map.put(nums[i] , 0);
    }
    return list ;
    }

}
