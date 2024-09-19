import java.util.Hashtable;
import java.util.List;

public class Hash1 {
    public static void main(String[] args) {
        Hashtable<String, List<String>> mp = new Hashtable<>();
        System.out.println("Ismail".hashCode());
        mp.put("Vignesh", List.of("Sabru", "test"));
        mp.put("Ismail",List.of("Hari"));
        mp.put("Puna", List.of("sandy"));
        mp.put("Abi", List.of("Deepak"));
        mp.put("Bala",List.of( "Sakthi"));
        System.out.println(mp.get("Ismail"));
        System.out.println(mp.get("Vignesh"));
        System.out.println(mp.get("Abi"));
    }
}
