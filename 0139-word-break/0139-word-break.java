class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 0; i < n; i++) {

            if (!dp[i]) continue;

            for (String word : wordDict) {

                if (s.startsWith(word, i)) {
                    dp[i + word.length()] = true;
                }
            }
        }

        return dp[n];
    }
}
