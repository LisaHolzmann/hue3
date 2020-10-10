/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue3.bsp3;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 *
 * @author holzm
 */
public class Main {

    public static void main(String[] args) {

        final Predicate<Integer> gerade = i -> (i % 2 == 0);
        final Predicate<Integer> positiv = i -> (i > 0);
        final Predicate<Integer> zahlNull = i -> (i == 0);
        final Predicate<Integer> wertNull = i -> (i == null);

        System.out.println("Gerade (10): " + gerade.test(10));
        System.out.println("Gerade (9): " + gerade.test(9));
        System.out.println("----------------------------------");

        System.out.println("Positiv(-1): " + positiv.test(-1));
        System.out.println("Positiv(4): " + positiv.test(4));
        System.out.println("----------------------------------");

        System.out.println("Zahl ist Null (0): " + zahlNull.test(0));
        System.out.println("Zahl ist Null (3): " + zahlNull.test(3));
        System.out.println("----------------------------------");

        System.out.println("Wert ist null(2): " + wertNull.test(2));
        System.out.println("Wert ist null(null): " + wertNull.test(null));
        System.out.println("----------------------------------");

        final Predicate<String> less4B = i -> (i.length() < 4);
        System.out.println("Länge kleiner 4: " + less4B.test("lol"));
        System.out.println("Länge kleiner 4: " + less4B.test("Hallo"));
        System.out.println("----------------------------------");

        System.out.println("Positiv und gerade (10): " + positiv.and(gerade).test(10));
        System.out.println("Positiv und gerade (3): " + positiv.and(gerade).test(3));
        System.out.println("----------------------------------");

        System.out.println("Positiv und ungerade(7): " + positiv.and(gerade.negate()).test(7));
        System.out.println("Positiv und ungerade(-2): " + positiv.and(gerade.negate()).test(2));

    }

}
