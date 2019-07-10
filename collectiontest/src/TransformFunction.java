import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * TransformFunction
 *
 * @author dusk
 * @since 2019/7/8
 */
public class TransformFunction {

    static Function<I, O> transform(Function<I, O> in) {
        return in.andThen(o -> {
            System.out.println(o);
            return o;
        });
    }

    static Supplier<O> consume(Function<Supplier<I>, O> in) {
        return () -> in.apply(I::new);
    }

    public static void main(String[] args) {
        Function<I, O> f2 = transform(i -> {
            System.out.println(i);
            return new O();
        });

        O o = f2.apply(new I());

        Supplier<O> supplier1 = consume(i -> {
            System.out.println(i);
            return new O();
        });

        supplier1.get();
    }
}

class I {
    @Override
    public String toString() {
        return "I";
    }
}

class O {
    @Override
    public String toString() {
        return "O";
    }
}