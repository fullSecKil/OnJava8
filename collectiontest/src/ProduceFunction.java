import java.util.function.Function;

/**
 * ProduceFunction
 * 高阶函数产生
 *
 * @author dusk
 * @since 2019/7/8
 */
public class ProduceFunction {
    public static void main(String[] args) {
        FuncSS f = produce();
        // f.apply("!QAZ2wsx");
        System.out.printf("!QAZ2wsx lower of %s", f.apply("!QAZ2wsx"));
    }

    static FuncSS produce() {
        return String::toLowerCase;
    }
}

@FunctionalInterface
interface FuncSS extends Function<String, String> {

}
