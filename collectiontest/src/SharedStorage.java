import java.util.function.IntSupplier;

/**
 * SharedStorage
 *
 * @author dusk
 * @since 2019/7/9
 */
public class SharedStorage {
    public static void main(String[] args) {
        Closure1 closure1 = new Closure1();
        IntSupplier f1 = closure1.makeFun(0);
        IntSupplier f2 = closure1.makeFun(0);
        IntSupplier f3 = closure1.makeFun(0);
        System.out.println(f1.getAsInt());
        System.out.println(f2.getAsInt());
        System.out.println(f3.getAsInt());
    }
}

class Closure1 {
    int i;

    IntSupplier makeFun(int x) {
        return () -> i++;
    }
}

class Closure3 {
    IntSupplier makeFun(int x) {
        int i = 0;
        return () -> i + x;
    }
}