package org.example.oo.heranca;

public class HerancaMain {
    public static void main(String[] args) {
        // implementação que não sobreescreve os metodos herdados
        Selecao2002 selecao2002 = new Selecao2002();
        selecao2002.jogadasIncriveis();

        // implementação que sobreescreve os metodos herdados
        Selecao2023 selecao2023 = new Selecao2023();
        selecao2023.jogadasIncriveis();
    }
}
