package example.javastudy.lambda.bipredicate;

// T, U, V...
interface BiEvaluate<T,U> {
    boolean check(T t, U u);
}
