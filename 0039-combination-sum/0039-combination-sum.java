class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(candidates, target, 0, ans, list);

        return ans;
    }

    public void solve(int[] candidates, int target, int index,
                      List<List<Integer>> ans, List<Integer> list) {

        // Base Case
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        // Take the current element
        list.add(candidates[index]);
        solve(candidates, target - candidates[index], index, ans, list);
        list.remove(list.size() - 1);

        // Don't take the current element
        solve(candidates, target, index + 1, ans, list);
    }
}