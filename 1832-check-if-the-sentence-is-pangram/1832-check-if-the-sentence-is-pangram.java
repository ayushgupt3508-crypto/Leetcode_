class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        boolean[] count = new boolean[26];
        for(char ch : sentence.toCharArray()) count[ch - 'a'] = true;
        for(boolean res : count) if(!res) return false;
        return true;
    }
}