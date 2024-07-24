class Overloading {

int age;
String name;
public Overloading() {
    this.name = "Default";
    this.age = 0;
}
    public Overloading(int age) {
        this.age = age;
    }
    public Overloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]){
       Overloading v= new Overloading();
        Overloading v1= new Overloading("name",8);
       System.out.println("Hello");
        System.out.println(v1.name);
        System.out.println(v1.age);
    }
}
