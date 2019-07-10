import java.util.Objects;

/**
 * Bird
 *
 * @author dusk
 * @since 2019/7/3
 */
public class Bird implements Comparable<Bird> {
    int size;

    public Bird(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return size == bird.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "size=" + size +
                '}';
    }

    @Override
    public int compareTo(Bird o) {
        return this.size - o.size;
    }
}
