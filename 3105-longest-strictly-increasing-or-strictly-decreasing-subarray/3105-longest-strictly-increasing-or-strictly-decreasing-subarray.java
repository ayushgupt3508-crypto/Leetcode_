class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int res = 1;
        int inc = 1;
        // check for increasing 
        if(nums.length == 1) return 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                inc++;
                res = Math.max(res,inc);
            }
            else    inc = 1;
        }
        // check for decreasing
        int dec = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                dec++;
                res = Math.max(res,dec);
            }
            else    dec = 1;
        }
        return res;
    }
}