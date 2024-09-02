import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
    Students st1=new Students("Hari",21,19);
        Students st2=new Students("Abi",23,16);
        Students st3=new Students("Sandy",25,17);
        Students st4=new Students("Puna",29,12);
        Students st5=new Students("Bala",27,16);
        List<Students> q= new ArrayList<>();
        q.add(st1);
        q.add(st2);
        q.add(st3);
        q.add(st4);
        q.add(st5);
        for (Students e:q){
        System.out.println(e);
        }
        Collections.sort(q);
        System.out.println("-------------------");
        for (Students e:q){
        System.out.println(e);
        }
    }
}
