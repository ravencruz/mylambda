package org.play.ground.data.process;

@FunctionalInterface
public interface Predicate<T> {



    public boolean test(T type);

    public default Predicate<T> and(Predicate<T> other) {
//        return new Predicate<T>() {
//            @Override
//            public boolean test(T type) {
//                return this.test(type) && other.test(type);
//            }
//        };

//        return (T type) -> this.test(type) && other.test(type);

        return type -> test(type) && other.test(type);
    }

    public default Predicate<T> or(Predicate<T> other) {
        return t -> test(t) || other.test(t);
    }

    static <U> Predicate<U> isEqualsTo(U param) {
        return s -> s.equals(param);
    }
}
