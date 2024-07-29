class OuterClass1 extends OuterAbstract1 {
    public OuterClass1(){
        System.out.println("constructor of outerclass");
    }

    @Override
    public void runOuterAbstract1() {
    System.out.println("I am runOuterAbstract1");
    }

    class InnerClass1 extends InnerAbstract1 {
        public InnerClass1(){
            System.out.println("constructor of innerclass");
        }

        @Override
        public void runInnerAbstract1() {
            System.out.println("I am runInnerAbstract1");
        }

    }
}
