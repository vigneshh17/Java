import javax.lang.model.util.SimpleTypeVisitor14;
import java.util.Hashtable;

public class Main10 {
    public static void main(String[] args) {
     Hash2 st =new Hash2("Hari");
        Hash2 st2 =new Hash2("haran");
        Hash2 st1 =new Hash2("sai");
        Hashtable<Hash2, String> st4 = new Hashtable<>();
        st4.put(st, "Gilli");
        st4.put(st1, "BaLLI");
        st4.put(st2,"sallii");
        System.out.println(st.hashCode());
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }
}
