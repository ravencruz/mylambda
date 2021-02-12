package org.play.ground.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Executors;

public class Sample {
    /**
     * Wrote some code in an anonimous class
     * And we pass it to another piece of code
     * The code is executed "later"
     *
     * Pass code as a parameter
     * we used an anonymous class, since it is the only way to do it in
     *
     * Labda pass code as a parameter more simpler than with an instance of an anonimous class
     *
     * modifiers on the params of the lam expresoin (final annotation)
     * not is posible to specify the returned type of a lambda expression
     * @param args
     */
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Comparator<String> comparator2 = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

        String[] tabString = new String[]{"one", "two", "sixteen", "five"};
        System.out.println(Arrays.toString(tabString) );
        Arrays.sort(tabString, comparator2);
        System.out.println(Arrays.toString(tabString) );

        Runnable r = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i++ < 10) {
                    System.out.println("It works " + i);
                }
            }
        };

        Runnable r2 = () -> {
            int i = 0;
            while(i++ < 10) {
                System.out.println("It works " + i);
            }
        };

        Executors.newSingleThreadExecutor().execute(r);

    }
}
