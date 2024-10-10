package com.iesvdm.lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        /**
         *  Consumer es una interfaz funcional que recibe un argumento y no devuelve nada.
         *  Se utiliza para realizar operaciones sobre el argumento.
         *
         *  accept(T t) -> Realiza la operación sobre el argumento.
         *  andThen(Consumer<? super T> after) -> Devuelve un Consumer que realiza la operación actual y después la operación after.
         */

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Hello World");


    }
}
