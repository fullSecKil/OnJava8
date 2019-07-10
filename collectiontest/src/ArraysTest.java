import java.util.Random;

/**
 * ArraysTest
 *
 * @author dusk
 * @since 2019/7/5
 */
public class ArraysTest {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i] += 1;
        }
        for (int a :
                a2) {
            System.out.println(a);
        }
        for (int a :
                a1) {
            System.out.println(a);
        }

        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        System.out.println("length of a=" + a.length);

        printArray("ab", "cd", "ef");
        printArray('1', '2', '4');

        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
        System.out.println(howHot.ordinal());
    }

    static void printArray(String... args) {
        for (String a :
                args) {
            System.out.println(a);
        }
    }

    static void printArray(Character... args) {
        System.out.println("first");
        for (Character c : args) {
            System.out.print(" " + c);
        }
    }
}

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}