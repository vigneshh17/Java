public class CreateThread {
    synchronized public void print(){
      for (int i=0;i<10;i++){
          System.out.println(Thread.currentThread().getName() + "---->"+  i);
          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
    }
}
