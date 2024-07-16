class Array {
    public static void main(String[] args){
        int [] a=new int [4];
        int[] b={1,2,3};
        System.out.println(b.length);
        a[2]=20;
        for (int i=2;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}