
/**
 * MethodReferences
 *
 * @author dusk
 * @since 2019/7/5
 */
public class MethodReferences {
    static class Description {
        String about;

        public Description(String about) {
            this.about = about;
        }

        void help(String msg) {
            System.out.println(about + " " + msg);
        }
    }

    public static void main(String[] args) {
        Describe d = new Describe();
        Callable c = d::show;
        c.call("call()");

        c = MethodReferences::hello;
        c.call("xuerui");

        c = new Description("valuable")::help;
        c.call("information");

        c = Helper::assist;
        c.call("zuishuai");
    }

    private static void hello(String s) {
        System.out.println("Hello" + s);
    }
}

class Helper {
    static void assist(String msg) {
        System.out.println(msg);
    }

    void sss() {

    }
}

interface Callable {
    void call(String s);
}

class Describe {
    void show(String msg) {
        System.out.println(msg);
    }
}