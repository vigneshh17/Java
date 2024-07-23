class ClassAndConstructor {
    String name;
    int age;
    String gender;

    public ClassAndConstructor(){
        System.out.println("default");
    }
    public ClassAndConstructor(String name,int age, String gender){
        System.out.println("I am parametrized");
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void eat() {};
    public void sleep() {};
    public void work() {};
    public static void main(String[] args){
       ClassAndConstructor c = new ClassAndConstructor("sabru",31,"male");
        System.out.println(c.age);
        System.out.println(c.name);
        ClassAndConstructor s = new ClassAndConstructor("ismail",28,"male");
        System.out.println(s.hashCode());
        System.out.println(s.name);
        ClassAndConstructor f = new ClassAndConstructor();
        System.out.println(f.hashCode());
        System.out.println(f.name);
    }
}