import java.util.HashSet;

/**
 * HashSetTest
 *
 * @author dusk
 * @since 2019/7/3
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet objs = new HashSet();
        objs.add(new EuqalsObj());
        objs.add(new EuqalsObj());
        objs.add(new HashcodeObj());
        objs.add(new HashcodeObj());
        objs.add(new HashSetObj());
        objs.add(new HashSetObj());
        System.out.println(objs);
    }
}

class EuqalsObj {
    public boolean equest(Object obj) {
        return true;
    }
}

class HashcodeObj {
    @Override
    public int hashCode() {
        return 1;
    }
}

class HashSetObj {
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}