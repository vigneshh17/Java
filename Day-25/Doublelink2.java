public class Doublelink2 {
    public static void main(String[] args) {
    Doublelink node1= new Doublelink(null,"ismail");
    Doublelink node2= new Doublelink(node1,"vignesh");
    Doublelink node3= new Doublelink(node2,"Ayesha");
    Doublelink node4= new Doublelink(node3,"sabru");
    node1.nextnode=node2;
    node2.nextnode=node3;
    node3.nextnode=node4;
    node2.nextnode = node4;
    node4.previousnode = node2;
    System.out.println(node2.previousnode.data);
    System.out.println(node1.previousnode);
    System.out.println(node1.nextnode.data);
    }
}
