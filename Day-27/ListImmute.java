import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListImmute {
    public static void main(String[] args) {
        List<String> r= new ArrayList<>();
        r.add("qwer");
        r.add("asdf");
        System.out.println(r);
        r.add("zxcc");
        System.out.println(r);
        List<String> s= Collections.unmodifiableList(r);
        System.out.println(s);
        r.add("pooo");
        System.out.println(s);
    }
}
