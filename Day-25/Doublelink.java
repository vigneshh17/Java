public class Doublelink {
String data;
Doublelink previousnode;
Doublelink nextnode;
public Doublelink(Doublelink node,String data){
this.data=data;
this.previousnode= node;
this.nextnode= null;
}
}
