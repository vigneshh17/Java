class ArrayExample {
    public static void main (String[] args){
        String[][] k = new String[2][4];
        k[1][2]="vignesh";
        k[1][3]="Sabarudeen";
        for (int r = 0; r < k.length; r++) {
            for (int c = 0; c < k[r].length; c++) {
                System.out.println(k[r][c]);
            }
        }
    }
}