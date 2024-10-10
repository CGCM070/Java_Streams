package com.iesvdm.es.lambdas.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        /**
         *  BiPredicate es una interfaz funcional que recibe dos argumentos y devuelve un boolean.
         *  Se utiliza para realizar operaciones de filtrado sobre los dos argumentos.
         *  test(T t, U u) -> Devuelve true o false en función de si los argumentos cumplen la condición.
         *  and(BiPredicate<? super T, ? super U> other) -> Devuelve un BiPredicate que realiza la operación actual y después la operación other.
         *  or(BiPredicate<? super T, ? super U> other) -> Devuelve un BiPredicate que realiza la operación actual o la operación other.
         */

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(5, 3));

        BiPredicate<String,String> biPredicate2 = (s1, s2) -> s1.equals(s2);
        System.out.println(biPredicate2.test("Hello3", "Hello"));

    }
}
