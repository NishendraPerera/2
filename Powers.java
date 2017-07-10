class Powers {
    public static void main(String[] args) {
        // int i = Integer.parseInt(args[0]);
        // int j = Integer.parseInt(args[1]);
        // int value = 1;
        // for (int k = 0; k < 20; k++) {
        // value *= i;
        // }
        // System.out.println(value);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int[][] Powers = new int[40][40];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                Powers[i][j] = 1;
                for (int k = 0; k < j; k++) {
                    Powers[i][j] *= i;
                }
            }
        }
        System.out.println(Powers[a][b]);
    }
}