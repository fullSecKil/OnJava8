/**
 * RunnableMethodReference
 *
 * @author dusk
 * @since 2019/7/5
 * <p>
 * Runnable使用lambda
 */
public class RunnableMethodReference {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("lambda")).start();

        new Thread(Go::go).start();
    }
}

class Go {
    static void go() {
        System.out.println("Go::go()");
    }
}