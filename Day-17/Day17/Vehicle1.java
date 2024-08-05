package Day17;

import java.io.*;

class Vehicle1 implements Serializable {
    public static void main(String[] args) throws IOException {
    Vehicle a=new Vehicle("white","honda",2001,"aaaa", 3456);
    FileOutputStream ab=new FileOutputStream("anc.txt");
    ObjectOutputStream bc=new ObjectOutputStream(ab);
    bc.writeObject(a);
    bc.close();
    ab.close();
    }
}
