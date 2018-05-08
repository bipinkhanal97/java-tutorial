package lambda;

/**
 * Created by bipin on 4/6/16.
 */
public class LambdaBasic {
    public static void main(String[] args) {
        performOperation(14, 7, new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        });
        performOperation(14, 7, new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a - b;
            }
        });
        performOperation(14, 7, new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a * b;
            }
        });
    }

    public static void performOperation(int a, int b, MathOperation mathOperation) {
        System.out.println(mathOperation.operation(a, b));
    }
}
