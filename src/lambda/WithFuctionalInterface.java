package lambda;

import java.util.function.IntBinaryOperator;

/**
 * Created by bipin on 4/8/18.
 */
public class WithFuctionalInterface {
    public static void performOperation(int a, int b, IntBinaryOperator intBinaryOperator) {
        System.out.println(intBinaryOperator.applyAsInt(a, b));
    }

    public static void main(String[] args) {
        performOperation(5, 6, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });

        performOperation(6, 2, (a, b) -> a + b);
    }
}
