class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        int temp = 0;
        for(int i = 0; i < m; i++){
            StringBuilder s = new StringBuilder();
            for(int j = 0; j < n; j++){
                if(i == 0 || j == n - 1) s.append('.');
                else s.append('#');
            }
            res[temp++] = s.toString();
        }
        return res;
    }
}