import java.util.Comparator;

public class StateComparator implements Comparator<Population> {
    @Override
    public int compare(Population o1, Population o2) {
    return o1.noofstates.compareTo(o2.noofstates);
    }
}
