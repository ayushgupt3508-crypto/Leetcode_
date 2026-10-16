class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0) + 1);
        }
        // Set<Integer> set = new HashSet<>();
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(set.contains(entry.getValue())) return false;
        //     set.add(entry.getValue());
        // }
        int[] freq = new int[1001];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(freq[entry.getValue()] > 0) return false;
            freq[entry.getValue()]++;
        }
        return true;
    }
}