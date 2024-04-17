class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0.0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        maxAvg = Math.max((double) sum / k, maxAvg);
        int left = 0;
        int right = k - 1;
        while(right < nums.length - 1){
            sum -= nums[left++];
            sum += nums[++right];
            maxAvg = Math.max((double) sum / k, maxAvg);
        }

        return maxAvg;
    }
}