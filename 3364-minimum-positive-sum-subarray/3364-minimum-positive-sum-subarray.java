class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;
        for(int i = l; i <= r; i++){
            l = i;
            int sum = 0;
            for(int j = 0; j < l; j++) sum += nums.get(j);
            System.out.println(sum);
            res = sum < res && sum > 0 ? sum : res;
            for(int start = 0; l < nums.size(); start++){
                sum -= nums.get(start);
                sum += nums.get(l++);
                System.out.println(sum);
                res = sum < res && sum > 0 ? sum : res;
            }
        }
        return res > 0 && res != Integer.MAX_VALUE ? res : -1;

    }
}