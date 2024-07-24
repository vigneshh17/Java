class Chaining {
    int age;
    String address;
    public Chaining(int age) {
        this("avadi");
        this.age = age;

    }
    public Chaining(String address) {
        this.address = address;
    }
    public static void main(String args[]){
    Chaining a=new Chaining(10);
        System.out.println(a.age);
        System.out.println(a.address);
    }
    }
