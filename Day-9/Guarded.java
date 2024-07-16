class Guarded {
    public static void main(String[] args){
        Object a="555555";
        switch (a){
        case String s->  System.out.println("i am string"+s);
            case Integer i-> System.out.println("i am integer"+i);
            default -> System.out.println("i am not unknown");
        }
        System.out.println(getData(a));
    }

    public static Object getData(Object o) {
        return switch (o){
            case String s && s.length()  -> ""
            default -> throw new IllegalStateException("Unexpected value: " + o);
        };
    }


        }