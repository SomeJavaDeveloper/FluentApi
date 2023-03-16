import java.util.List;
import java.util.function.Function;

public interface Reducer<T, R> {

    Reducer<T, R> within(T... args);

    Reducer<T, R> map(Function<T, T> function);

    R getWithAppliedFunction(Function<List<T>, R> function);
}
