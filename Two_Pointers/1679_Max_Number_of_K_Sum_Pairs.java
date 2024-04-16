class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while(left < right){
            int val = nums[left] + nums[right];
            if(val == k){
                count++;
                left++;
                right--;
            }else if(val < k){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}