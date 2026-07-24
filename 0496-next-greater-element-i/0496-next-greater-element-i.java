import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Stack to maintain a monotonic decreasing order
        Stack<Integer> stack = new Stack<>();

        // Stores next greater element for each index of nums2
        int[] nextGreater = new int[nums2.length];

        // Step 1: Find next greater element for every element in nums2
        for (int i = nums2.length - 1; i >= 0; i--) {

            int element = nums2[i];

            // Remove all smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }

            // Store the answer
            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = stack.peek();
            }

            // Push current element
            stack.push(element);
        }

        // Step 2: Store (value -> next greater element)
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], nextGreater[i]);
        }

        // Step 3: Build the answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}