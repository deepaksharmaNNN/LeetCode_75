class Solution {
    public int largestAltitude(int[] gain) {
        int prefix = 0;
        int max = 0;
        for(int i = 0;i<gain.length;i++){
            prefix+=gain[i];
            max = Math.max(max,prefix);
        }
        return max;
    }
}