package example.javastudy.lambda.predicate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvaluateTest {

    @Test
    @DisplayName("整数の負数判定テスト")
    void testIsNegative() {
        Evaluate<Integer> eval = num -> num < 0;

        assertTrue(eval.isNegative(-1));
        assertFalse(eval.isNegative(0));
        assertFalse(eval.isNegative(1));
    }

    @Test
    @DisplayName("小数の負数判定テスト")
    void testIsNegativeDouble() {
        Evaluate<Double> eval =  num -> num < 0;

        assertTrue(eval.isNegative(-1.5));
        assertFalse(eval.isNegative(0.0));
        assertFalse(eval.isNegative(1.5));
    }


    @Test
    @DisplayName("Predicateで整数の負数判定テスト")
    void testIsNegativeWithPredicate() {
        Predicate<Integer> eval = num -> num < 0;

        assertTrue(eval.test(-1));
        assertFalse(eval.test(0));
        assertFalse(eval.test(1));
    }

    @Test
    @DisplayName("checkメソッドで余りが0か判定テスト")
    void testIsNegativeWithCheck() {
        assertTrue(EvaluatePredicate.check(4, t -> t % 2 == 0));
        assertFalse(EvaluatePredicate.check(5, t -> t % 2 == 0));
    }
}