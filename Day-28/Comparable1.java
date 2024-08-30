import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable1 {
    public static void main(String[] args) {
     List<String> c= new ArrayList<>();
     c.add("abi");
     c.add("sandy");
     c.add("aarav");
     for(String s : c){
     System.out.println();
     }
        Collections.sort(c);
        for(String s : c){
            System.out.println(s);
        }
    }
}
