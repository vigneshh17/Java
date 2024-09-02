import java.util.Comparator;

public class PopulationComparator implements Comparator<Population> {
    @Override
    public int compare(Population o1, Population o2) {
    return o2.populationincrores.compareTo(o1.populationincrores);
    }
}
