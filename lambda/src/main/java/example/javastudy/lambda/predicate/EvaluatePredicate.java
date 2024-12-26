package example.javastudy.lambda.predicate;

import java.util.function.Predicate;

public class EvaluatePredicate {
    // Tは引数、Predicateはlambdaなので、Arrow形式で引数を渡す
    public static <T> boolean check(T t, Predicate<T> predicate) {
        return predicate.test(t);
    }
}
