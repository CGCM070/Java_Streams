package com.iesvdm.es.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        /**
         *  Operadores finales y Operadores no finales
         *  Operadores finales: terminan el flujo de datos y devuelven un resultado.
         *  Operadores no finales: no terminan el flujo de datos y devuelven un Stream.
         *
         *  ForEach: Operador final que recorre los elementos del Stream y aplica una operación a cada uno.
         */

        List<String> nombres = Arrays.asList("Cesar", "Adrian", "Alan", "Mohamed", "Ali");

//        nombres.stream().forEach(string -> System.out.println(string)); // Forma tradicional
        nombres.stream().forEach(System.out::println);                    // Forma simplificada

        System.out.println("------------------StartsWith A ------------------------");
        nombres.stream().filter(string -> string.startsWith("A")).forEach(System.out::println);

        System.out.println("-------------------UpperCase--------------------");
        nombres.stream().map(String::toUpperCase).forEach(System.out::println);


    }
}
