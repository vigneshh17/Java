import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
    List<Movie> z= new ArrayList<>();
    z.add(new Movie("vazhai",2024,145.000));
        z.add(new Movie("paiyaa",2010,166.000));
        z.add(new Movie("96",2019,65.000));
        z.add(new Movie("Demonte",2024,88.000));
        z.add(new Movie("singam",2015,99.000));
        for (Movie x:z){
        System.out.println(x);
        }
        System.out.println("-------------");
        Collections.sort(z);
        for (Movie x:z){
            System.out.println(x);
        }
    }
}
