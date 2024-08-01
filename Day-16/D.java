class D implements  C {
    public static void main(String[] args) {
        D d = new D();
        d.run();
        d.eat();
        d.sleeping();
            }

    @Override
    public void run() {
        System.out.println("I am running");
    }
}

