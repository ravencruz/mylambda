package org.play.ground.data.process;

import org.play.ground.lambdas.lcone.Person;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 *   May be anotated with @functinalInterface
 *   Four categories:
 *        Consumer.- Consumer, BiConsumer
 *        Supplier.- does not take any param and return an object of type T
 *        Function.- takes an objct of one type and returns and object of another type
 *        Predicate.- takes an object and return a boolean
 */
public class Category {

    public static void main(String[] args) {
        Supplier<Person> personSupplier = () -> new Person();
        Supplier<Person> personSupplierMethodReference = Person::new;

        Function<Person, Integer> ageMapper = person -> person.getAge();
        Function<Person, Integer> ageMapper2 = Person::getAge;

        Predicate<Person> ageGT20 = person -> person.getAge() > 20;
    }
}
