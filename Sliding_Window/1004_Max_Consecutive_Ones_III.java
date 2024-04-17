class Solution {
    public int longestOnes(int[] nums, int k) {
        /*
        TC-> O(N) + O(N)
        int max = 0;
        int left = 0;
        int right = 0;
        int zeros = 0;
        while(right < nums.length){
            if(nums[right] == 0) zeros++;
            while(zeros > k){
                if(nums[left] == 0) zeros--;
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;*/

        // TC -> O(N)
        int max = 0;
        int left = 0;
        int right = 0;
        int zeros = 0;
        int maxLength = 0;
        while(right < nums.length){
            if(nums[right] == 0) zeros++;
            if(zeros > k){
                if(nums[left] == 0) zeros--;
                left++;
            }
            if(zeros <= k) maxLength = Math.max(right - left + 1, maxLength);
            right++;
        }
        return maxLength;
    }
}