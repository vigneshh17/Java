import com.sun.source.tree.Tree;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Hash3 {
    public static void main(String[] args) {
     Map<String,Integer> mp=new LinkedHashMap<>()  ;
     /*long starttime = new Date().getTime();
     for(int i =0; i< 10000000; i++){
         mp.put(String.valueOf(i), i);
     }
     System.out.println(new Date().getTime()-starttime);*/
     mp.put("Iha",2);
     mp.put("Honey",5);
     mp.put("aa",4);
     mp.put("jj",10);
     mp.put("Iha",3);
     for (Map.Entry<String,Integer> r:mp.entrySet()){
     System.out.println(r.getKey()+" "+r.getValue());
        }


    }

}
