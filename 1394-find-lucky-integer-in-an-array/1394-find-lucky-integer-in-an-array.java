class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        for(int n : arr) count[n]++;
        for(int i = count.length - 1; i > 0; i--){
            if(count[i] == i) return i;
        }
        return -1;
    }
}