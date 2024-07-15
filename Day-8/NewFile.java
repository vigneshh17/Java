class NewFile{
    public static void main(String[] args) {
     Object a=10;
     if (a instanceof Integer){
     System.out.println("i am integer");
     } else if (a instanceof Float) {
      System.out.println("i am float");

     }

     //
        switch (a){
        case Integer i->
        System.out.println("integer");
        case Float f->
        System.out.println("float");
        case String s-> System.out.println("string");
        case CharSequence c-> System.out.println("charsequence");
        default -> throw new IllegalStateException("Unexpected value: " + a);
        }
    }
}