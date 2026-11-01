class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        int[] count = new int[26];
        for(char ch : allowed.toCharArray()) count[ch - 'a']++;
        for(String s : words){
            for(char ch : s.toCharArray()){
                if(count[ch - 'a'] == 0) {res--; break;}
            }
            res++;
        }
        return res;
    }
}