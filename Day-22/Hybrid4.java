public class Hybrid4 implements Hybrid2,Hybrid3{

    @Override
    public void run() {
    System.out.println("byee");
    }
    public static void main(String[] args) {
    Hybrid4 a = new Hybrid4();
    a.run();
    }
}
