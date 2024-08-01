import java.util.List;

class A {
    public static void main(String[] args) {
        List<String> dataList = List.of("Sabru", "Ismail", "Vicky");
        dataList.stream().filter(s -> s.startsWith("I")).toList();
        Runnable r = () -> {
            System.out.println("Heart");
        };
        r.run();
        New ab = (String a) -> {
            return a.startsWith("I") || a.startsWith("V");
        };

        for(int i=0; i< dataList.size(); i++){
            System.out.println(ab.bhai(dataList.get(i)));
        }
    }
}
