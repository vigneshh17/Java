public class Students implements  Comparable<Students>{
    String name;
    int rollno;
    int age;
    public Students (String name,int rollno,int age){
    this.name=name;
    this.rollno=rollno;
    this.age=age;
    }

    @Override
    public int compareTo(Students o) {
        System.out.println("---" + this.name + "---" + o.name + "---" + (this.age - o.age));
        if(this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }
    public String toString(){
    return this.name+ " "+ this.rollno+" "+this.age;
    }
}
