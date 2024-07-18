class ArrayMultiply {
    public static void main(String[] args){
        int[][] arr1 = { {2,3,4}, {5,6,7}};
        int[][] arr2 = { {20,30,100}, {60,40,10}};
        int row = arr1.length;
        int col = arr1[0].length;
        int[][] arr3= new int[row][col];
        for (int i=0;i< row ;i++){
            for(int j=0;j<col;j++){
//                System.out.println(arr1[i][j]);
//                System.out.println(arr2[i][j]);
                arr3[i][j]=arr1[i][j]*arr2[i][j];



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