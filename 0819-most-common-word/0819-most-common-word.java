class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        int max = 0;
        String res = "";
        char ch = ' ';
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]+", " ");
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(String s : banned) set.add(s);

        StringBuilder s = new StringBuilder();
        for(int i = 0; i <= paragraph.length(); i++){
            if(i < paragraph.length())
                ch = paragraph.charAt(i);
            else ch = ' ';
            if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ){
                s.append(ch);
            }
            
            else{
                String temp = s.toString().toLowerCase();
                if(set.contains(temp)){s.setLength(0); continue;}
                map.put(temp, map.getOrDefault(temp,0) + 1);
                System.out.println(temp);
                if(map.get(temp) > max){
                    max = map.get(temp);
                    res = temp;
                }
                s.setLength(0);
            }
        }

        return res;
    }
}