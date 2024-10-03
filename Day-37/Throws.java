public class Throws {
    public static void main(String[] args) {
    try {
        int a[] = new int[10];
        a[11]= 20;
    }catch (ArithmeticException e){
        System.out.println( "divisible");
    }catch (RuntimeException e){
        System.out.println("not divisible");
    }
    }
}
