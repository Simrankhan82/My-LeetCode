class Solution {

    public List<String> restoreIpAddresses(String s) {

        List<String> ans = new ArrayList<>();

        restoreIp(s, 0, 0, "", ans);

        return ans;
    }

    public void restoreIp(String s,
                          int index,
                          int parts,
                          String current,
                          List<String> ans) {

        // Base case: formed exactly 4 parts and used all characters
        if (parts == 4 && index == s.length()) {
            ans.add(current);
            return;
        }

        // Invalid case
        if (parts == 4 || index == s.length()) {
            return;
        }

        // Try taking 1, 2, or 3 digits
        for (int len = 1; len <= 3; len++) {

            // Out of bounds
            if (index + len > s.length()) {
                break;
            }

            String part = s.substring(index, index + len);

            // Leading zero check
            if (part.length() > 1 && part.charAt(0) == '0') {
                continue;
            }

            int number = Integer.parseInt(part);

            // Greater than 255 is invalid
            if (number > 255) {
                continue;
            }

            // Build the current IP
            String next;

            if (current.length() == 0) {
                next = part;
            } else {
                next = current + "." + part;
            }

            // Recursive call
            restoreIp(s, index + len, parts + 1, next, ans);
        }
    }
}