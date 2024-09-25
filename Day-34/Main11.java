import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main11 {
    public static void main(String[] args) {
        Set<Setstudent> a= new TreeSet<>();
        Setstudent st = new Setstudent(5 , "boy");
        Setstudent st1=new Setstudent(8,"girl");
        Setstudent st2= new Setstudent(9,"sai");
       // Setstudent st3 = new Setstudent(5 , "boy");
        a.add(st);
        a.add(st1);
        a.add(st2);
       // a.add(st3);
       // a.add(null);
        for(Setstudent r : a) {
         System.out.println(r.name);
        }

    }
}
