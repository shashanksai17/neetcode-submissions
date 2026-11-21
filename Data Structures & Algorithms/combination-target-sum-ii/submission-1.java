class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public void find(int[] nums, int idx, int target, List<Integer> temp) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < nums.length; i++) {

            if (i > idx && nums[i] == nums[i - 1])
                continue;

            if (nums[i] > target)
                break;

            temp.add(nums[i]);

            find(nums, i + 1, target - nums[i], temp);

            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        find(nums, 0, target, new ArrayList<>());
        return res;
    }
}