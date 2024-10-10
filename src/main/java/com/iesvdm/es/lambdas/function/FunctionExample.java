package com.iesvdm.es.lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /**
         *
         * Function es una interfaz funcional que recibe un argumento y devuelve un resultado.
         * Se utiliza para transformar un objeto en otro.
         * apply(T t) -> Devuelve el resultado de aplicar la función sobre el argumento.
         *
         *  andThen(Function<? super R, ? extends V> after)
         * -> Devuelve una función que realiza la operación actual y después la operación after.
         */

        Function<String, Integer> function = (s) -> s.length(); // Recibe un String y devuelve un Integer
        System.out.println(function.apply("Hello World"));

    }
}
