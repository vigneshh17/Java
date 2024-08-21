public class Node1 {
    public static void main(String[] args) {
    Node node1= new Node(20);
    Node node2= new Node(30);
    Node node3= new Node(40);
    Node node4= new Node(50);
    Node node5= new Node(60);
    node1.next=node2;
    node2.next=node3;
    node3.next=node4;
    node4.next=node5;
    while (node1 != null) {
     System.out.println(node1.data);
     node1 =node1.next;
    }
//    System.out.println(node1);
 //   System.out.println(node1.data);
   // System.out.println(node1.next);

    //System.out.println(node2);
    //System.out.println(node2.data);
    //System.out.println(node2.next);
    }
}

