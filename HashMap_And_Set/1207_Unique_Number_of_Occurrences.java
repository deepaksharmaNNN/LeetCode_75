class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int val : arr) 
            map.put(val, map.getOrDefault(val, 0) + 1);
        Set<Integer> set = new HashSet<>();
        for(int key : map.keySet()){
            int val = map.get(key);
            if(set.contains(val)) return false;
            set.add(val);
        }
        return true;

    }
}