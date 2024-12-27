package example.javastudy.lambda.bipredicate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BiEvaluateTest {

    @Test
    @DisplayName("数値の大小比較テスト")
    void testNumberComparison() {
        BiEvaluate<Integer, Double> eval = (num1, num2) -> num1 < num2;

        assertTrue(eval.check(1, 2.0));
        assertFalse(eval.check(2, 1.0));
        assertTrue(eval.check(-1, 0.0));
    }

    @Test
    @DisplayName("文字列と数値の長さ比較テスト")
    void testStringLengthComparison() {
        BiEvaluate<String, Integer> eval = (str, len) -> str.length() > len;

        assertTrue(eval.check("hello", 4));
        assertFalse(eval.check("hi", 3));
        assertTrue(eval.check("world", 3));
    }
}