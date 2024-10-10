package com.iesvdm.es.lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        /**
         * BiConsumer es una interfaz funcional que recibe dos argumentos y no devuelve nada.
         * Se utiliza para realizar operaciones sobre los argumentos.
         *
         * accept(T t, U u) -> Realiza la operación sobre los argumentos.
         */

        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + " " + s2);
        biConsumer.accept("Hello", "World");

    }
}
