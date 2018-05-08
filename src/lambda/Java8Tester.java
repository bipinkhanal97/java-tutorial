package lambda;


/**
 * Created by bipin on 4/6/16.
 */
public class Java8Tester {
    public static void performOperation(int a, int b, MathOperation mathOperation) {
        System.out.println(mathOperation.operation(a, b));
    }

    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;

        performOperation(5, 6, add);
        performOperation(5, 6, sub);
        performOperation(5, 6, mul);
    }
}
