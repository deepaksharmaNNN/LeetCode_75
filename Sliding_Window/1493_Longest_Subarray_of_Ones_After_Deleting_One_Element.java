class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int zero = 0;
        int max = 0;
        while(right < nums.length){
            if(nums[right] == 0) zero++;
            if(zero > 1){
                if(nums[left] == 0) zero--;
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max - 1;
    }
}