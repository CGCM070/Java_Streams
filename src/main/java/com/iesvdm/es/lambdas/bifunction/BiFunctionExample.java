package com.iesvdm.es.lambdas.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /**
         * BiFunction es una interfaz funcional que recibe dos argumentos y devuelve un resultado.
         * Se utiliza para realizar operaciones sobre los dos argumentos.
         *
         * apply(T t, U u) -> Realiza la operación sobre los dos argumentos.
         * andThen(Function<? super R, ? extends V> after) -> Devuelve un BiFunction que realiza la operación actual y después la operación after.
         */

        BiFunction<String, String, String> biFunction = (s1, s2) -> s1 + "-" + s2;
        String result = biFunction.apply("Hello", "World");
        System.out.println(result);
    }

}
