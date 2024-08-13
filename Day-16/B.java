class B implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        E b=new E();
        System.out.println(b);
        E b1 = (E)b.clone();
        System.out.println(b1);

    }
}










