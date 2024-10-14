package com.iesvdm.es.lambdas.binary;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {


        /**
         * BinaryOperator es una interfaz funcional que recibe dos argumentos del mismo tipo y devuelve un resultado del mismo tipo.
         * Se utiliza para realizar operaciones sobre los dos argumentos.
         * apply(T t, U u) -> Realiza la operación sobre los dos argumentos.
         */

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b; // Recibe dos Integer y devuelve un Integer
        Integer result = binaryOperator.apply(5, 5);
        System.out.println(result);

    }
}
