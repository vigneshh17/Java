public class Circular {
    int data;
    Circular nextnode;
    Circular previousnode;
    public Circular (int data){
    this.data=data;
    this.nextnode =null;
    this.previousnode =null;
    }
    public String toString(){
        return "  " + this.data;
    }
}
