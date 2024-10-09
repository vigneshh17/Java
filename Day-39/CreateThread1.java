public class CreateThread1 implements Runnable{
    public CreateThread1(CreateThread p, String threadName) {
        this.p = p;
    }

    CreateThread p;
    public void run(){
    p.print();
    }
}
