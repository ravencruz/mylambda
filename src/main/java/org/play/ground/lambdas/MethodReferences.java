package org.play.ground.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferences {

    /**
     * Lamdba expresion is sintactic sugar
     * a new aye or writting anonymous clases
     * an alternative yntax: metohd references
     * @param args
     */
    public static void main(String[] args) {
        Function<Person, Integer> f1 = person -> person.getAge();
        Function<Person, Integer> f2 = Person::getAge;

        BinaryOperator<Integer> sum = (i1, i2) -> i1 + i2;
        BinaryOperator<Integer> sum2 = (i1, i2) -> Integer.sum(i1, i2);
        BinaryOperator<Integer> sum3 = Integer::sum;

        BinaryOperator<Integer> max = Integer::max;

        //consumer takes an argument and does not return anything
        Consumer<String> printer = s -> System.out.println(s);
        Consumer<String> printer2 = System.out::println;




    }
}
