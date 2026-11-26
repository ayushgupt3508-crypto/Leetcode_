class Solution {
    public boolean canAliceWin(int n) {
        int count = 10, alice = 1;
        while(n >= count){ n -= count; count--; alice ^= 1; }
        return (alice == 0);
    }
}