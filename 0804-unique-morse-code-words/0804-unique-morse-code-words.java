class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(String s : words){
            StringBuilder code = new StringBuilder();
            for(char ch : s.toCharArray())
                code.append(morse[ch - 'a']);
            set.add(code.toString());
        }
        return set.size();
    }
}