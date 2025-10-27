
// Custom exception
class CustomException extends Exception {
    public CustomException(String s) {
        super(s);
    }
}


public class excep {
    public static void main(String[] args) {
        try {
            int i = 0;
            int j = 18;
            System.err.println(j / i);
            throw new ArithmeticException("i should be valid integer");
        } catch (ArithmeticException ae) {
            System.err.println(ae);
        }
         catch (Exception e) {
            System.err.println(e);
        }
    }
}
