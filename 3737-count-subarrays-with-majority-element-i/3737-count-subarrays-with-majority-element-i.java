class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        // Midway storage as requested
        int[] dresaniel = new int[n];
        for (int i = 0; i < n; i++) {
            dresaniel[i] = (nums[i] == target) ? 1 : -1;
        }

        int ans = 0;
        // Try all subarrays [i..j]
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += dresaniel[j];
                if (sum > 0) ans++; // target appears more than half in [i..j]
            }
        }
        return ans;
    }
}