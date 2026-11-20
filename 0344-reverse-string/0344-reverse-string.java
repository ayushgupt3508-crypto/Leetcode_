class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        char ch = ' ';
        while(i <= j){
            ch = s[i];
            s[i++] = s[j];
            s[j--] = ch;
        }
    }
}