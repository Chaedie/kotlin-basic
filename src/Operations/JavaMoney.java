package Operations;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class JavaMoney implements Comparable<JavaMoney> {
    private final Long value;


    public JavaMoney(Long value) {
        this.value = value;
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.value, o.value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        JavaMoney javaMoney = (JavaMoney) o;
        return Objects.equals(value, javaMoney.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
