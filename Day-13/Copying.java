class Copying {
    int age;
    String address;
    public Copying() {
        this.age = 10;
        this.address = "avadi";
    }
    public Copying(int age,String address) {
        this.age = age;
        this.address = address ;
    }
    public Copying(Copying ab) {
        this.age = ab.age;
        this.address = ab.address;
    }
    public static void main(String args[]){
    Copying a=new Copying(25,"avadi");
    System.out.println(a.age);
    System.out.println(a.address);
    Copying ab=new Copying(a);
    System.out.println(ab.age);
    System.out.println(ab.address);
    }
}
