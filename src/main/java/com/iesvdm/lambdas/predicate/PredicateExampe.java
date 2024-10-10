package com.iesvdm.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExampe {
    public static void main(String[] args) {

        /**
         * Predicate es una interfaz funcional que recibe un argumento y devuelve un boolean.
         * Se utiliza para realizar operaciones de filtrado.
         * test(T t) -> Devuelve true o false en función de si el argumento cumple la condición.
         * and(Predicate<? super T> other) -> Devuelve un Predicate que realiza la operación actual y después la operación other.
         * or(Predicate<? super T> other) -> Devuelve un Predicate que realiza la operación actual o la operación other.
         * negate() -> Devuelve un Predicate que niega la operación actual.
         */

        Predicate<String> predicate = (s) -> s.length() > 5; // Recibe un String y devuelve un boolean
        System.out.println(predicate.test("Hello World"));

    }
}
