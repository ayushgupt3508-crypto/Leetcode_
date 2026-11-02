class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums1) set.add(n);
        for(int n : nums2) if(set.contains(n)) return n;
        return -1;
    }
}