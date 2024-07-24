public class Singleton {
    int age;
    String address;
    private static Singleton single;
    private Singleton(int age,String address){
        this.age=age;
        this.address=address;
    }
    public static Singleton getObject() {
        if(single == null) {
            single = new Singleton(20, "Avadi");
        }
        return single;
    }

    }
