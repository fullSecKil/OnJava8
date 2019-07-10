import java.util.function.IntToDoubleFunction;

/**
 * FunctionWithWrapped
 *
 * @author dusk
 * @since 2019/7/8
 */
public class FunctionWithWrapped {
    public static void main(String[] args) {
        IntToDoubleFunction fid2 = i -> i;
        double d = fid2.applyAsDouble(100);
        System.out.println("d = " + d);
    }
}
