public class Privatesingelton {
    public static void main(String args[]) {
        Singleton a = Singleton.getObject();
        System.out.println(a.age);
        System.out.println(a.hashCode());

        Singleton b = Singleton.getObject();
        System.out.println(b.age);
        System.out.println(b.hashCode());
    }
}

