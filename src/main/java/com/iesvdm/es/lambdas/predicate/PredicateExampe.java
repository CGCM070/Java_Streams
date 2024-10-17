package com.iesvdm.es.lambdas.predicate;

import java.util.Arrays;
import java.util.List;
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


        // Ejemplo de Predicate combinado
        List<String> names = Arrays.asList("Hello", "World", "Java", "Programming", "Stream", "Lambda");

        Predicate<String> longMayorQue5 = s -> s.length() > 5;
        Predicate<String> contieneA = s -> s.contains("a");

        // Combinamos ambos Predicates usando el método and
        Predicate<String> combinedPredicate = longMayorQue5.and(contieneA);

        List<String> filtrados = names.stream()
                .filter(n -> n.length() > 5 && n.contains("a"))
                .toList();
        System.out.println(filtrados);


    }
}
