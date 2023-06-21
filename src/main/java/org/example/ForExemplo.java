package org.example;

import java.util.List;

public class ForExemplo {
    public static void main(String[] args) {
        // exemplo do loop infinito do
        for (int i = 0; i < 10;) {
            i++;
            System.out.println(i);
        }


        // fazendo interação do loop incrementando
        for (int i = 0; i < 10;) {
            i++;
            System.out.println(i);
        }

        // fazendo interação do loop decrementando
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // foreach
        List<Integer> intList = List.of(1, 2, 3, 4);
        for (Integer item : intList) {
            System.out.println(item);
        }

        // foreach lambda
        intList.forEach(item -> System.out.println(item));
    }
}
