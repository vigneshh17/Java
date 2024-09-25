import java.util.Objects;

public class Setstudent implements Comparable {
    int age;
    String name;
    public Setstudent(int age,String name){
    this.age=age;
    this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Setstudent that = (Setstudent) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        return ((Setstudent)o).age - this.age;
    }
}
