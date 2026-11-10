class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seenNumbers.containsKey(complement)) {
                return new int[] { seenNumbers.get(complement), i };
            }

            seenNumbers.put(nums[i], i);
    }
        return new int[]{};
    }
}
