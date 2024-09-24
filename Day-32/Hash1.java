import java.util.*;

public class Hash1 {
    public static void main(String[] args) {
        //Hashtable<String, List<String>> mp = new Hashtable<>();
        /*System.out.println("Ismail".hashCode());
        mp.put("Vignesh", List.of("Sabru", "test"));
        mp.put("Ismail",List.of("Hari"));
        mp.put("Puna", List.of("sandy"));
        mp.put("Abi", List.of("Deepak"));
        System.out.println(mp.get("Ismail"));
        System.out.println(mp.get("Vignesh"));
        System.out.println(mp.get("Abi"));*/
        Hashtable<String,Integer> mp=new Hashtable<>()  ;
        long starttime = new Date().getTime();
        for(int i =0; i< 10000000; i++){
            mp.put(String.valueOf(i), i);
        }
        System.out.println(new Date().getTime()-starttime);
    }
}
