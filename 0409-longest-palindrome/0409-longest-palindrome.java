class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        boolean addOne = false;
        int[] count = new int[65];
        for(char ch : s.toCharArray()) count[ch - 'A']++;
        for(int n : count){
            if(n % 2 == 0) res += n;
            if(n % 2 == 1){
                if(!addOne) addOne = true;
                res += n - 1;
            }
        }
        return addOne ? res + 1 : res;
    }
}