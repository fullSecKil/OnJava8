import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * PredicateComposition
 * 谓词断言拼接
 *
 * @author dusk
 * @since 2019/7/9
 */
public class PredicateComposition {
    static Predicate<String> p1 = s -> s.contains("bar"),
            p2 = s -> s.length() < 5,
            p3 = s -> s.contains("foo"),
            p4 = p1.negate().and(p2).or(p3);

    public static void main(String[] args) {
        Stream.of("bar", "foobar", "foobaz", "fongopuckey").filter(p4)
                .forEach(System.out::println);
        // Stream.generate(() -> Arrays.asList("a", "b", "c")).forEach(System.out::println);
    }
}
