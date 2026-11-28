class Solution {
    public String toGoatLatin(String s) {
        Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));
        StringBuilder res = new StringBuilder();
        int count = 1;
        
        for(int i = 0; i < s.length(); i++){
            StringBuilder word = new StringBuilder();
            while(i < s.length() && s.charAt(i) != ' ')
                word.append(s.charAt(i++));
            if(!vowels.contains(Character.toLowerCase(word.charAt(0)))) { word.append(word.charAt(0)); word.deleteCharAt(0); }

            word.append("ma").append("a".repeat(count++)).append(' ');

            res.append(word);
        }
        if(res.length() > 0) res.deleteCharAt(res.length() - 1);

        return res.toString();
    }
}