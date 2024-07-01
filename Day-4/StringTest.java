class StringTest {
    public static void main(String arg[]){
        String a ="test";
        String b =new String("test");
        String c =new String("Test");
        String d ="test";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(a==d);
        System.out.println(b==c);
        System.out.println(b.equals(c));
        System.out.println(b.equalsIgnoreCase(c));
        String aa="vignesh";
        System.out.println(aa.length());
        System.out.println(aa.substring(2));
        System.out.println(aa.substring(3,6));
        //System.out.println(aa.substring(3,10));
        System.out.println(aa.indexOf("h"));
        System.out.println(aa.indexOf('h', 4));
        System.out.println(aa.indexOf('h', 4, 7));
        String s="sabrudeen";
        System.out.println(s.lastIndexOf('e'));
        String t="cake";
        String tt="pancake";
        System.out.println(tt.contains(t));



    }
}