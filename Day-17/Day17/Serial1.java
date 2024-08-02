package Day17;

import java.io.*;

class Serial1 implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
     FileInputStream fis = new FileInputStream("C:\\learning\\Java\\Day-17\\Day17\\ayesha2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Serials s = (Serials)ois.readObject();
        System.out.println(s.getAge());
        System.out.println(s.getAddress());
        System.out.println(s.getCurrency());
        System.out.println(s.getWeight());
        System.out.println(Serials.getGender());

    }
}
