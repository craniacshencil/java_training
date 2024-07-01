class mat {
    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3, 4}, {9, 23, 43, 44}, {4, 2, 55, 2}, {98, 2, 4, 5}};
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.printf("%d\t", mat[i][j]);
            }
                System.out.println();
        }
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(mat[i][j] > 10){
                    System.out.printf("%d -> column: %d row: %d\n", mat[i][j], i, j);
                }
            }
        }
    }
}
