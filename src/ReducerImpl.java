import java.util.List;
import java.util.function.Function;

public class ReducerImpl<T, R> implements Reducer<T, R> {
    private List<T> list;

    @SafeVarargs
    @Override
    public final Reducer<T, R> within(T... args) {
        list = List.of(args);
        return this;
    }

    @Override
    public Reducer<T, R> map(Function<T, T> function) {
        list = list.stream().map(function).toList();
        return this;
    }

    @Override
    public R getWithAppliedFunction(Function<List<T>, R> function) {
        return function.apply(list);
    }
}
