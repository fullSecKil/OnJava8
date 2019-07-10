import java.util.function.IntSupplier;

/**
 * AnonymousClosure
 *
 * @author dusk
 * @since 2019/7/9
 */
public class AnonymousClosure {
    IntSupplier makeFun(int x) {
        int i = 0;
        return () -> i + x;
    }
}
