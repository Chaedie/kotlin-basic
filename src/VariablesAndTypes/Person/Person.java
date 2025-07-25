package VariablesAndTypes.Person;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Nullable
    public String getName() {
        return name;
    }

    @NotNull
    public Integer getAge() {
        return age;
    }
}
