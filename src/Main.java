public class Main {
    public static void main(String[] args) {
        Reducer<Integer, String> reducer = new ReducerImpl();
        var result = reducer.within(1, 2, 3)
                .map(x -> x * 2)
                .map(x -> x + 11)
                .getWithAppliedFunction(list -> {
                    StringBuilder builder = new StringBuilder();
                    for (Integer str : list) {
                        builder.append(str);
                    }
                    return builder.toString();
                });
        System.out.println(result);
    }
}