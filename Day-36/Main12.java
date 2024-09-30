public class Main12 {
    public static void main(String[] args) {
        try {
            int c = 5/0;
        } catch (ArithmeticException c) {
            throw new CustomException("errorout");
        }

    }
}
