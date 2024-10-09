public class Main15 {
    public static void main(String[] args) {
     CreateThread q=new CreateThread();
     Runnable r= new CreateThread1(q, "Vignesh");
     Runnable s= new CreateThread1(q, "Sabrudeen");
     Thread t = new Thread(r);
     Thread t1 = new Thread(s);
     t.setName("Vicky");
     t1.setName("Sabru");
     t.run();
     t1.run();
     t.run();
    }
}
