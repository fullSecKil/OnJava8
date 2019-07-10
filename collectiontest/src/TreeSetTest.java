import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * TreeSetTest
 *
 * @author dusk
 * @since 2019/7/3
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Bird> birdTreeSet = new TreeSet<>();
        birdTreeSet.add(new Bird(1));
        birdTreeSet.add(new Bird(3));
        birdTreeSet.add(new Bird(2));

        Iterator<Bird> iterator = birdTreeSet.iterator();
        while (iterator.hasNext()) {
            Bird bird = iterator.next();
            System.out.println(bird);
        }

        List<String> list = Arrays.asList("ab", "cd", "ef");
        list.sort(String::compareTo);
        // Arrays.parallelSort();
    }
}
