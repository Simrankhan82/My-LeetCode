import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        // Traverse all bars + one extra iteration
        for (int i = 0; i <= n; i++) {

            // Dummy height = 0 to empty the stack at the end
            int currHeight = (i == n) ? 0 : heights[i];

            // Pop until the stack becomes increasing again
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {

                // Height of the rectangle
                int height = heights[stack.pop()];

                int width;

                // No previous smaller element
                if (stack.isEmpty()) {
                    width = i;
                }
                // Previous smaller exists
                else {
                    width = i - stack.peek() - 1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            // Push current index
            stack.push(i);
        }

        return maxArea;
    }
}