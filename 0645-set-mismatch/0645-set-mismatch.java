class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[10001];
        int[] res = new int[2];
        for(int n : nums){
            if(count[n] > 0){
                res[0] = n;
            }
            count[n]++;
        }
        for(int i = 1; i < count.length; i++){
            if(count[i] == 0) {res[1] = i; break;}
        }
        return res;
    }
}