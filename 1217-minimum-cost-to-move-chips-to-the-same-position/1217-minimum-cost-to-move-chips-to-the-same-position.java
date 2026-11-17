class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        for(int i = 0; i < position.length; i++) if(position[i] % 2 == 1) odd++;
        return Math.min(odd, position.length - odd);
    }
}