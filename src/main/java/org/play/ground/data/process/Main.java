package org.play.ground.data.process;

/**
 * A lambda expression is an instance of a functional interface
 * A functional interface is an interface with only one abstract method
 *  Defualt methods do not count
 *  Status Methods do not count
 *  Method from the object class do not count
 *

 */
public class Main {

    public static void main(String[] args) {
        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String type) {
                return type.length() < 20;
            }
        };

        System.out.println(p.test("Hello World"));


        Predicate<String> p1 = (String s) -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 5;

        Predicate<String> p3 = p1.and(p2);
        System.out.println("P3 for Yes: " + p3.test("Yes"));
        System.out.println("P3 for Good Morning: " + p3.test("Good Morning"));
        System.out.println("P3 for Good Morning gentlemen: " + p3.test("Good Morning gentlemen"));

        Predicate<String> p4 = p1.or(p2);
        System.out.println("P4 for Yes: " + p4.test("Yes"));
        System.out.println("P4 for Good Morning: " + p4.test("Good Morning"));
        System.out.println("P4 for Good Morning gentlemen: " + p4.test("Good Morning gentlemen"));

        System.out.println();
        Predicate<String> p5 = Predicate.isEqualsTo("Yes");

        System.out.println("P5 for Yes: " + p5.test("Yes"));
        System.out.println("P5 for No: " + p5.test("NO"));

        Predicate<Integer> p6 = Predicate.isEqualsTo(1);
        System.out.println("P6 for 1: " + p6.test(1));
        System.out.println("P6 for 2: " + p6.test(2));
    }
}
