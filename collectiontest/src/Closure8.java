import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Closure8
 *
 * @author dusk
 * @since 2019/7/9
 */
public class Closure8 {
    Supplier<List<Integer>> makeFun() {
        List<Integer> ai = new ArrayList<>();
        ai.add(1);
        return () -> ai;
    }

    public static void main(String[] args) {
        Closure8 c7 = new Closure8();
        List<Integer> l1 = c7.makeFun().get(), l2 = c7.makeFun().get();
        System.out.println(l1);
        System.out.println(l2);
        l1.add(42);
        l2.add(96);
        System.out.println(l1);
        System.out.println(l2);
    }
}

//class Closure9 {
//    Supplier<List<Integer>> makeFun() {
//        List<Integer> ai = new ArrayList<>();
//        ai = new ArrayList<>();
//        return () -> ai;
//    }
//}
