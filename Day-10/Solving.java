class Solving {
    public static void main(String[] args){
        int[][] arr1 = { {0,6,4}, {1,3,5}};
        int[][] arr2 = { {12,20,15}, {11,18,20}};
        int row = arr1.length;
        int col = arr1[0].length;
        int[][] arr3= new int[row][col];
        for (int i=0;i< row ;i++){
            for(int j=0;j<col;j++){
                if (arr2[i][j]!=1 && arr1[i][j]!=1 && ((arr1[i][j]+arr2[i][j])%2==0)){
                    arr3[i][j]= arr1[i][j]*arr2[i][j];
                }
                else{
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                }

            }

        }
        for (int i=0;i< arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j]+"  ");



            }
            System.out.println();


        }
    }
}