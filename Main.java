package dividedbyzero;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 3 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.printf("Caught runtime exception = %s"
, e.getMessage());
        }
    }
}

