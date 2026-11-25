class Solution {
    public int balancedStringSplit(String s) {
        int res = 0, counter = 0;
        for(char ch : s.toCharArray()) { counter += (ch == 'L') ? 1 : -1; if(counter == 0) res++; }
        return res;
    }
}