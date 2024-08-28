import javax.swing.plaf.synth.SynthSpinnerUI;

public class Circular2 {
    public static void main(String[] args) {
    Circular node1=new Circular(100);
        Circular node2=new Circular(200);
        Circular node3=new Circular(300);
        node1.nextnode=node2;
        node1.previousnode=node3;
        node2.nextnode=node3;
        node2.previousnode=node1;
        node3.nextnode=node1;
        node3.previousnode=node2;
        Circular startingNode = node2;
        while(true) {
            System.out.println(node2.previousnode.toString());
            System.out.println(node2.data);
            System.out.println(node2.nextnode.toString());
            if(node2.nextnode == startingNode) {
                break;
            }
            node2 = node2.nextnode;
        }
    }
}
