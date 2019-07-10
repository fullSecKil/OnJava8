import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * Curry3Args
 * 对于每个级别的箭头级联（Arrow-cascading），你可以围绕类型声明包装成另一个函数
 *
 * @author dusk
 * @since 2019/7/9
 */
public class Curry3Args {
    public static void main(String[] args) {
        Function<String, Function<String, Function<String, String>>> sum =
                a -> b -> c -> a + b + c;
        Function<String, Function<String, String>> hi = sum.apply("Hi ");
        Function<String, String> ho = hi.apply("Ho ");
        System.out.println(ho.apply("Hup"));

        IntFunction<IntUnaryOperator> curriedIntAdd = a -> b -> a + b;
        IntUnaryOperator add4 = curriedIntAdd.apply(4);
        System.out.println(add4.applyAsInt(5));
        IntUnaryOperator add5 = a -> a + 10;
        System.out.println(add5.applyAsInt(13));
    }
}
