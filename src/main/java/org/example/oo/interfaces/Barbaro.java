package org.example.oo.interfaces;

public class Barbaro implements Personagem {
    @Override
    public void andar() {
        System.out.println("andar");
    }

    @Override
    public void bater() {
        System.out.println("bater com arma de duas mãos");
    }
}
