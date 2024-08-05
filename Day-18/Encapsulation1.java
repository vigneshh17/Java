public class Encapsulation1 {
    public static void main(String[] args) throws InterruptedException {
     Encapsulation a=new Encapsulation();

    Thread t=new Thread(()->{
    a.setV(200, Thread.currentThread().getName());
    });
    t.start();
    Thread y=new Thread(()->{
    a.setV(300, Thread.currentThread().getName());
    });
    y.start();
    y.join(100);
    }
}
