import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        int n = nums.length;
        int left = 0, maxFreq = 1;
        long total = 0; // Keep track of the sum of differences in the current window

        for (int right = 1; right < n; right++) {
            // Add the difference between nums[right] and nums[right - 1] for the current window
            total += (long) (nums[right] - nums[right - 1]) * (right - left);

            // If total cost exceeds k, shrink the window from the left
            while (total > k) {
                total -= nums[right] - nums[left];
                left++;
            }

            // Update the maximum frequency
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}
