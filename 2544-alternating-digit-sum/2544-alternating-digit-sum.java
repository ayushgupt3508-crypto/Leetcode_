class Solution {
    public int alternateDigitSum(int n) {
        String digit = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < digit.length(); i++){
            int temp = digit.charAt(i) - '0';
            if( i % 2 == 0 ) sum += temp;
            else sum -= temp;
        }
        return sum;
    }
}