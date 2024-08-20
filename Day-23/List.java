import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("vignesh");
        a.add("ismail");
        a.add(null);
        a.add("vignesh");
        a.add(null);
  //      for (int i = 0; i < a.size(); i++) {
  //          System.out.println(a.get(i));
            Iterator<String> b = a.iterator();
            while (b.hasNext()) {
                System.out.println(b.next());
                b.remove();
            }
        }
    }


