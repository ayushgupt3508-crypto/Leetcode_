class Solution {
    public String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder();
        for(char ch : address.toCharArray()){
            if(ch == '.')
                res.append("[.]");
            else 
                res.append(ch);
        }
        return res.toString();
    }
}