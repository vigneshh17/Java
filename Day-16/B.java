import java.io.Serializable;

class B implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        B b=new B();
        System.out.println(b);
        B b1 = (B)b.clone();
        System.out.println(b1);

    }
}










