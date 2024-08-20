import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(10);
        a.add("aa");
        a.add("bb");
        a.add("cc");
        a.add("dd");
        a.add("ee");
        a.add("ff");
        a.add("gg");
        a.add("hh");
        a.add("ii");
        a.add("qq");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
    }