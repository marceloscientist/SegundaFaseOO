package com.impacta.qintess.inter;

public
class Geladeira implements Eletro {
    @Override
    public void ligar () {
        System.out.println("ligando geladeira...");
    }

    @Override
    public void desligar() {
        System.out.println("desligando geladeira...");
    }

    @Override
    public
    void abrir ( ) {

    }
}
