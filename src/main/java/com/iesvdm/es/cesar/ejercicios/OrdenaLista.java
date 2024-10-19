package com.iesvdm.es.cesar.ejercicios;

import com.iesvdm.es.cesar.ejercicios.persona.Persona;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrdenaLista {
    public static void main(String[] args) {


        /**
         * Dada una lista de números enteros filtra por numeros pares y
         * ordenarla de menor a mayor. Y en otro caso, de mayor a menor.
         * Utilizar streams.
         */

        // De menor a mayor
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares =
                numeros.stream()
                        .filter(n -> n % 2 == 0)
                        .sorted()
                        .toList();
        System.out.println(numerosPares);

        // De mayor a menor
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numeroPares2 =
                numeros2.stream()
                        .filter(n -> n % 2 == 0)
                        .sorted(Comparator.reverseOrder())
                        .toList();
        System.out.println(numeroPares2);


        /**
         * Transformar y agrupar una lista de palabras
         * Dada una lista de palabras,
         * convierte cada palabra a mayúsculas y agrúpalas por su longitud.
         * */

        List<String> palabras = Arrays.asList("stream", "java", "lambda", "function", "code");
        Map<Integer, List<String>> agrupadas = palabras.stream()
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(String::length));
        System.out.println(agrupadas);


        /**
         * Procesar una lista de objetos:
         * Dada una lista de objetos Persona con atributos nombre y edad,
         * filtra las personas mayores de 18 años,
         * ordena por edad y convierte la lista resultante en un mapa
         * donde la clave sea el nombre y el valor sea la edad.
         * */

        List<Persona> personas = Arrays
                .asList(new Persona("Ana", 20),
                        new Persona("Juan", 15),
                        new Persona("Luis", 25),
                        new Persona("Maria", 30),
                        new Persona("Pedro", 10));


        Map<String, Integer> personasFiltradas = personas.stream()
                .filter(p -> p.getEdad() > 18)
                .collect(Collectors.toMap(Persona::getNombre, Persona::getEdad));
        System.out.println(personasFiltradas);

    }
}
