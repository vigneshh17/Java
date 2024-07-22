import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Clone {
    public static void main(String[] args) {
        int a[]={2,3,4};
        int b[]=a.clone();
        b[1]= 5;
        Arrays.stream(a).asLongStream().forEach(System.out::println);
        Arrays.stream(b).asLongStream().forEach(System.out::println);
        System.out.println(a.hashCode());

    }
}