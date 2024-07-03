class StringInbuilt {
    public static void main (String args[]){
System.out.println("phone");
String s ="Data Testing";
s=s.replace("at" ,"ro");
System.out.println(s);
String r="ab1234cde59";
r=r.replaceAll("\\d","*");
System.out.println(r);
String t="This is vignesh";
    t=t.replaceAll("\\s","-");
System.out.println(t);
String a="Vignesh  student    ";
a=a.trim();
System.out.println(a.length());
String b="Vignesh";
String c="Elumalai";
b=b.concat("c");
System.out.println(b);
String z="vicky";
char x=z.charAt(3);
System.out.println(x);
String q="Vignesh";
String w="Vivek";
int e=q.compareTo(w);
System.out.println(e);
String o= """
        What is your name
        age
        Mobile number
        Address 
        """;
System.out.println(o);





    }

}