import java.util.function.Function;

/**
 * ConsumeFunction
 * 高阶函数 消费
 *
 * @author dusk
 * @since 2019/7/8
 */
public class ConsumeFunction {

    public static void main(String[] args) {
        Two t = consume(o -> new Two());
        System.out.println("t = " + t);
    }

    static Two consume(Function<One, Two> onetwo) {
        return onetwo.apply(new One());
    }
}

class One {
}

class Two {
}