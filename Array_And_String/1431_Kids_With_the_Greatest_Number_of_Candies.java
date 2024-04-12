class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int val : candies){
            if(max < val) max = val;
        }
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}