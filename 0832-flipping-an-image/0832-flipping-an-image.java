class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0; i < n; i++){
            int end = n - 1;
            for(int start = 0; start < end; start++, end--){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
            }
            for(int j = 0; j < n; j++) image[i][j] ^= 1;
        }
        return image;
    }
}