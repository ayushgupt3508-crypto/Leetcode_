class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        boolean addOne = false;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) map.put(ch, map.getOrDefault(ch,0) + 1);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int n = entry.getValue();
            if(n % 2 == 0) res += n;
            if(n % 2 == 1){
                if(!addOne) addOne = true;
                res += n - 1;
            }
        }
        return addOne ? res + 1 : res;
    }
}