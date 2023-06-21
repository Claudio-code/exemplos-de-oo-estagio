package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        // mostrando difrentes tipos de lambda
        // removendo uma string vazia do array
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("nome");
        list.add("play5");

        list.removeIf(s -> {
            return s.isEmpty();
        });

        list.add("");
        list.removeIf(s -> s.isEmpty());

        // é possivel criar um metodo e usar ele tambem
        list.add("");
        list.removeIf(Lambda::removeIfEmpty);

        // no java 17 pra frente é possivel fazer assim
        list.add("");
        list.removeIf(String::isEmpty);
    }

    private static boolean removeIfEmpty(String param) {
        return param.isEmpty();
    }
}
