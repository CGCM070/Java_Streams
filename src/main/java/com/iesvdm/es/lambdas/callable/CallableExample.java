package com.iesvdm.es.lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /**
         * Callable es una interfaz funcional que no recibe argumentos y devuelve un resultado.
         * Se utiliza para ejecutar tareas y devolver un resultado.
         * call() -> Devuelve el resultado.
         * dentro de un bloque try-catch porque call() lanza una excepción.
         * @throws Exception
         * @return String
         * @see java.util.concurrent.Callable
         *
         * a diferencia de Runnable, Callable puede devolver un resultado y lanzar una excepción.
         */

        Callable<String> callable = () -> "Hello World"; // No recibe argumentos y devuelve un String
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
