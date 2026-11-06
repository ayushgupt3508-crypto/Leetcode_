class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int temp = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                int count = 1;
                temp = i - 1;
                res[i] = 0;
                while(temp >= 0 && s.charAt(temp) != c) res[temp--] = count++;
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                int count = 1;
                temp = i + 1;;
                while(temp < s.length() && s.charAt(temp) != c){
                    if(res[temp] == 0) res[temp] = count;
                    else res[temp] = Math.min(res[temp], count);
                    count++; temp++;
                }
            }
        }
        return res;
    }
}