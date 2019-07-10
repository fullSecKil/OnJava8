/**
 * CtorReference
 * 捕获构造函数的引用，然后通过引用调用该构造函数
 *
 * @author dusk
 * @since 2019/7/8
 */
public class CtorReference {
    public static void main(String[] args) {
        MakeNoArgs mna = Dog::new;
        Make1Arg m1a = Dog::new;
        Make2Args m2a = Dog::new;

        Dog dn = mna.make();
        Dog d1 = m1a.make("comet");
        System.out.println(d1.name);
    }
}

class Dog {
    String name;
    int age;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

interface MakeNoArgs {
    Dog make();
}

interface Make1Arg {
    Dog make(String nm);
}

interface Make2Args {
    Dog make(String nm, int age);
}