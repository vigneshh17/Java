public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
 System.out.println("Hello"+message);

    }
}
