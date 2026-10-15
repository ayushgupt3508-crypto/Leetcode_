class Solution {
    public int sumCounts(List<Integer> nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.size(); i++){
            int temp = 0;
            for(int j = i; j < nums.size(); j++){
                if(!set.contains(nums.get(j))){
                    set.add(nums.get(j));
                    temp++;
                }
                res += (temp * temp);
            }
            set.clear();
        }
        return res;
    }
}