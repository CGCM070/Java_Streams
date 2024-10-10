package com.iesvdm.es.lambdas.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {


        /**
         * UnaryOperator es una interfaz funcional que recibe un argumento y devuelve el mismo tipo de argumento.
         * Se utiliza para realizar operaciones sobre el argumento y devolver el mismo tipo de argumento.
         * apply(T t) -> Realiza la operación sobre el argumento y devuelve el mismo tipo de argumento.
         */

        UnaryOperator<String> unaryOperator = (s) -> s.toUpperCase(); // Recibe un String y devuelve un String
        System.out.println(unaryOperator.apply("hello world"));

    }
}
