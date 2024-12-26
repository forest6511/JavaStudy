package example.javastudy.lambda.biconsumer;

public interface BiProcessor<T, U> {
    void process(T t, U u);
}
