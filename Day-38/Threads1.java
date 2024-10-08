public class Threads1 {
    public static void main(String[] args) {
    System.out.println("Thread ---->"+ Thread.currentThread().getId());
    Thread2 t = new Thread2(5);
    t.start();
    Thread2 t1 = new Thread2(20);
    t1.start();
    }
}
