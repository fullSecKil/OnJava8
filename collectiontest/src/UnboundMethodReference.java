/**
 * UnboundMethodReference
 *
 * @author dusk
 * @since 2019/7/5
 */
public class UnboundMethodReference {

    public static void main(String[] args) {
        X x = new X();
        // MakeString ms=X::f;

        TransformX sp = X::f;
        System.out.println(sp.transform(x));
    }
}

interface TransformX {
    String transform(X x);
}

interface MakeString {
    String make();
}

class X {
    String f() {
        return "X::f()";
    }

    String b() {
        return "X::b()";
    }
}