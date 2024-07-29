abstract class OuterAbstract1 {
    public OuterAbstract1(){
        System.out.println("constructor of outerAbstract1");
    }

    public abstract void runOuterAbstract1();

    public void nonAbstract(){
    System.out.println("testing");
    }

    abstract class InnerAbstract1 {
        public InnerAbstract1() {
            System.out.println("constructor of innerAbstract1");
        }

        public abstract void runInnerAbstract1();
    }
}