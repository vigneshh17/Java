import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class Vector2 {
    public static void main(String[] args) {

        Vector<String> a=new Vector<>();
        long vectorStartingTime = new Date().getTime();
        for(int i =0; i< 10000000; i++) {
            a.add(" test "+ i);
        }
        System.out.println(new Date().getTime() - vectorStartingTime);

        ArrayList<String> lis = new ArrayList<>();
        long listStartingTime = new Date().getTime();
        for(int i =0; i< 10000000; i++) {
           lis.add(" test "+ i);
        }
        System.out.println(new Date().getTime() - listStartingTime);
    }
}
