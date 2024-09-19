import java.util.Objects;

public class Hash2 {
    String name;

    public Hash2(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hash2 hash2 = (Hash2) o;
        return Objects.equals(name, hash2.name);
    }

    @Override
    public int hashCode() {
        return name.charAt(0);
    }
}
