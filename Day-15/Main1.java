class Main1 {
    public static void main(String args[]){
        OuterClass1 oc= new OuterClass1();
        OuterClass1.InnerClass1 c= oc.new InnerClass1();
        oc.runOuterAbstract1();
    }
}
