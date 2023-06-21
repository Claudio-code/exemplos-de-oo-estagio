package org.example.oo.interfaces;

public class Maga implements Personagem {
    @Override
    public void andar() {
        System.out.println("andando");
    }

    @Override
    public void bater() {
        System.out.println("poder de raio");
    }
}
