import java.util.LinkedList;

public class Node4 {
    public static void main(String[] args) {
        LinkedList<String> r = new LinkedList<>();
        r.add("hello");
        r.add("hi");
        r.add(0, "bye");
        for(String s: r){
            System.out.println(s);
        }
    }
}
