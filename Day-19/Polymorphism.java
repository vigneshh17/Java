public class Polymorphism {
    float z=6.3222f;
    int c=(int)z;
    public void add (int a,int b){
        System.out.println("int");
    }
    public void add (int a,char b){
    System.out.println("char");
    }
    public static void main(String[] args) {
    Polymorphism a=new Polymorphism();
    a.add (5,'j' );
    System.out.println(a.c);
    }
}
