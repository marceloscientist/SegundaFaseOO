package com.impacta.qintess.inter;

public
class Micro implements Eletro {
    @Override
    public
    void ligar () {
        System.out.println("ligando micro...");
    }

    @Override
    public
    void desligar ( ) {
        System.out.println("desligando micro...");
    }

    @Override
    public
    void abrir ( ) {

    }
}
