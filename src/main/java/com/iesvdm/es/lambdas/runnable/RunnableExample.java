package com.iesvdm.es.lambdas.runnable;

public class RunnableExample {
    public static void main(String[] args) {
        /**
         * Runnable es una interfaz funcional que no recibe argumentos y no devuelve un resultado.
         * Se utiliza para ejecutar tareas sin necesidad de argumentos.
         * run() -> Ejecuta la tarea.
         */

        Runnable runnable = () -> System.out.println("Hello World"); // No recibe argumentos y no devuelve nada
        runnable.run();
    }
}
