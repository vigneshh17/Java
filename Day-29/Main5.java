import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        Population p = new Population("India", 1044222L, 29);
        Population p1 = new Population("USA", 44222L, 18);
        Population p2 = new Population("China", 8764848L, 20);
        List<Population> pllist = new ArrayList<>();
        pllist.add(p);
        pllist.add(p1);
        pllist.add(p2);
        for (Population i : pllist) {
            System.out.println(i);
        }
        System.out.println("by Sabrudeen----");
        //pllist.stream().sorted(Comparator.comparing(Population::getCountryname).thenComparing(Population::getPopulationincrores)).forEach(System.out::println);
        System.out.println("by name----");
        Collections.sort(pllist, new NameComparator());
        for (Population i : pllist) {
            System.out.println(i);
        }
        System.out.println("by population----");
        Collections.sort(pllist, new PopulationComparator());
        for (Population i : pllist) {
            System.out.println(i);
        }
        System.out.println("by State----");
        Collections.sort(pllist, new StateComparator());
        for (Population i:pllist){
            System.out.println(i);
        }
    }
}
