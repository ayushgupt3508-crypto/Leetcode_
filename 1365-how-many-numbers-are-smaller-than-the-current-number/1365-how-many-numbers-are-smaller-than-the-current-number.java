class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = Arrays.copyOf(nums,nums.length);
        Arrays.sort(res);
        Map<Integer,Integer> map = new HashMap<>();
        map.put(res[0],0);
        int temp = 1;
        for(int i = 1; i < nums.length; i++){
            if(res[i] != res[i-1])
                map.put(res[i], temp);
            temp++;
        } 
        for(int i = 0; i < nums.length; i++){
            res[i] = map.get(nums[i]);
        }
        return res;
    }
}