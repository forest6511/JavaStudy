package example.javastudy.lambda.biconsumer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiProcessorTest {
    @Test
    @DisplayName("文字列と数値の結合処理テスト")
    void testStringNumberProcessor() {
        StringBuilder result = new StringBuilder();
        BiProcessor<String, Integer> processor = (str, num) ->
                result.append(str).append(num);

        processor.process("Count: ", 42);
        assertEquals("Count: 42", result.toString());
    }

    @Test
    @DisplayName("文字列の複数回追加テスト")
    void testStringRepeatProcess() {
        StringBuilder result = new StringBuilder();
        BiProcessor<String, Integer> processor = (str, num) -> {
            IntStream.range(0, num).forEach(
                    i -> result.append(str)
            );
        };

        processor.process("Hello ", 3);
        assertEquals("Hello Hello Hello ", result.toString());
    }
}
