package com.iesvdm.es.lambdas.supplier;

import java.util.function.Supplier;

public class SuplierExample {
    public static void main(String[] args) {
        /**
         * Supplier es una interfaz funcional que no recibe argumentos y devuelve un resultado.
         * Se utiliza para generar o suministrar valores sin necesidad de argumentos.
         * get() -> Devuelve el resultado.
         */


        /**
         * No existe BiSupplier
         */

        Supplier<String> supplier = () -> "Hello World"; // No recibe argumentos y devuelve un String
        System.out.println(supplier.get());

    }
}
