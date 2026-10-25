class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int aliceIn = dayOfYear(arriveAlice);
        int aliceOut = dayOfYear(leaveAlice);
        int bobIn = dayOfYear(arriveBob);
        int bobOut = dayOfYear(leaveBob);

        int start = Math.max(aliceIn,bobIn);
        int end = Math.min(aliceOut,bobOut);

        return start <= end ? end - start + 1: 0;
    }
    public int dayOfYear( String s){
        int[] daysOfYear = {0,31,59,90,120,151,181,212,243,273,304,334};
        int m = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        int d = (s.charAt(3) - '0') * 10 + (s.charAt(4) - '0');
        return daysOfYear[m - 1] + d;
    }
}