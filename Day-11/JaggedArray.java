class JaggedArray {
    public static void main(String[] args) {
        int a[][] = new int[2][];
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                a[i] = new int[3];
            } else if (i == 1) {
                a[i] = new int[2];
            }
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }

    }
}
