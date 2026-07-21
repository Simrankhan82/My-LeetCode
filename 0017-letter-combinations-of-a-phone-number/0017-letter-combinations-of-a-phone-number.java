class Solution {

    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return ans;
        }

        StringBuilder current = new StringBuilder();

        backtrack(digits, 0, current, ans);

        return ans;
    }

    public void backtrack(String digits, int index,
                          StringBuilder current,
                          List<String> ans) {

        // Base case
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {

            // Choose
            current.append(ch);

            // Recurse
            backtrack(digits, index + 1, current, ans);

            // Backtrack
            current.deleteCharAt(current.length() - 1);
        }
    }
}