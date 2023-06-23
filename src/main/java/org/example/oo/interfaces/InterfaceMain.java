package org.example.oo.interfaces;

public class InterfaceMain {
    public static void main(String[] args) {

        // Exemplo de metodos implementados de maneira diferente e com a mesma assinatura da interface

        Maga maga = new Maga();
        maga.andar();

        Barbaro barbaro = new Barbaro();
        barbaro.andar();
    }
}
