import static java.util.stream.LongStream.range;

/**
 * ForInTest
 *
 * @author dusk
 * @since 2019/7/4
 */
public class ForInTest {
    public static void main(String[] args) {
        String[] a = "An African Swallow".split(" ");
        System.out.println(a[0]);
        a();
    }

    public static int a(String a) {
        return 1;
    }

    public static void a() {
        System.out.println(1);
    }
}
