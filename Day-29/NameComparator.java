import java.util.Comparator;

public class NameComparator implements Comparator<Population> {
    @Override
    public int compare(Population o1, Population o2) {
        return o1.countryname.compareTo(o2.countryname);
    }
}
