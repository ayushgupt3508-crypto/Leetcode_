class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder res = new StringBuilder();
        int temp = sum;
        for(int i = 0, digit = 9; i < num; i++){
            while(digit > temp) digit--;
            temp -= digit;
            res.append(digit);
            digit = 9;
        }
        return temp == 0 ? res.toString() : new String("");
    }
}