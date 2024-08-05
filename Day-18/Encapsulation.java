class Encapsulation {
private int v=100;
public void setV(int v, String threadName){
this.v=v;
System.out.println("Thread "+ threadName +" modified requested v to set value "+ v);
}

}
