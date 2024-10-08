public class Thread2 extends Thread{
    int num =0;

    public Thread2(int num){
        this.num = num;
    }
    public void run(){
    for (int i=num;i<num*2;i++){
        System.out.println(Thread.currentThread().getName() + "-----"+ i);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
}
