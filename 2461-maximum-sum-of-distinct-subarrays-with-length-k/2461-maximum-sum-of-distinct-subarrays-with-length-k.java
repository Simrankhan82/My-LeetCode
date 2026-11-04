class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer , Integer> map = new HashMap<>();
        int left = 0;
        long sum = 0;
        long maxSum = 0 ;

        for(int right = 0 ; right < nums.length; right++){

            map.put(nums[right] , map.getOrDefault(nums[right] , 0)+1);
            sum += nums[right];

            if(right - left +1 > k){

                int outgoing = nums[left];
                sum -= outgoing;

                map.put(outgoing , map.get(outgoing)-1);

                if(map.get(outgoing) == 0){
                    map.remove(outgoing);
                }

                left++;
            }
            if(right - left +1 == k && map.size() == k){
                maxSum = Math.max(maxSum , sum);

            }
        }
        return maxSum ;
    }
}