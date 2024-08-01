interface C {
void run();

default void eat() {
    System.out.println("I am Eating");
}

default void sleeping() {
        System.out.println("I am sleeping");
    }
}
