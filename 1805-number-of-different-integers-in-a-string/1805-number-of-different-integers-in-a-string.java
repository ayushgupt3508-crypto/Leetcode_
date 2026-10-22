class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        StringBuilder s = new StringBuilder();
        int forZero = 0;
        for(char ch : word.toCharArray()){
            if(Character.isDigit(ch)){
                if(ch == '0' && s.length() == 0) { forZero = 1; continue;}
                s.append(ch);
            }else{
                if(s.length() > 0 || (s.length() == 0 && forZero == 1)){
                    set.add(s.toString());
                    forZero = 0;
                }
                s.setLength(0);
            }
        }
        if(s.length() > 0 || (s.length() == 0 && forZero == 1))
                    set.add(s.toString());
        return set.size();
    }
}