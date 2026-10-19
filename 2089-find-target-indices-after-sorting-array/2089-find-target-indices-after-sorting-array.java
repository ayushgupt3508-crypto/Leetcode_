class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int lessThanTarget = 0;
        int targetCount = 0;
        for(int n : nums){
            if(n < target) lessThanTarget++;
            else if(n == target) targetCount++;
        }
        for(int i = 0; i < targetCount; i++){
            res.add(lessThanTarget + i);
        }
        return res;
    }
}