import java.util.ArrayList;
import java.util.List;

public class Error {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        try {
            for (int i = 0; i < 1000000000; i++) {
                a.add("Hello+ i");
            }
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("Printed");
    }
}

