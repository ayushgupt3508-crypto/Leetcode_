class Solution {
    public int minMoves(int[] nums) {
        int res = 0, max = 0;
        for(int n : nums) max = Math.max(n, max);
        for(int n : nums) res += (max - n);
        return res;
    }
}