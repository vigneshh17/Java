import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add(String.valueOf(new Mobile("Apple", 2024, 32, 17.3)));
        l.add(String.valueOf(new Mobile("Samsung", 2023, 64, 16.3)));
        l.add(String.valueOf(new Mobile("Oppo", 2022, 28, 14.4)));
        l.add(String.valueOf(new Mobile("Vivo", 2019, 16, 15.7)));
        for (String o : l) {
            System.out.println(l);
        }
        System.out.println("-----");
        Collections.sort(l);
        for (String o : l) {
            System.out.println(l);
        }
    }
}
