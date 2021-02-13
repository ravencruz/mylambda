package org.play.ground.lambdas.lcone;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    public static Comparator<Person> comparing(Function<Person, Integer> f) {
        return (p1, p2) -> f.apply(p1) - f.apply(p2);
    }

    public int compare(T t1, T t2);
}
