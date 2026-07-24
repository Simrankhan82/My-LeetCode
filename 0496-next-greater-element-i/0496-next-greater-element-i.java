class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Stores the next greater element for each index of nums2
        int[] nextGreater = new int[nums2.length];

        // Monotonic decreasing stack
        Stack<Integer> stack = new Stack<>();

        // Find next greater element for every element in nums2
        for (int i = nums2.length - 1; i >= 0; i--) {

            int element = nums2[i];

            // Remove all smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }

            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = stack.peek();
            }

            // Push current element for future comparisons
            stack.push(element);
        }

        // Map each value in nums2 to its next greater element
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], nextGreater[i]);
        }

        // Build answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}