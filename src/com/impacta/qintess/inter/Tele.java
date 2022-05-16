package com.impacta.qintess.inter;

public
class Tele implements Eletro {
    @Override
    public
    void ligar () {
        System.out.println("ligando tele...");
    }

    @Override
    public
    void desligar ( ) {
        System.out.println("desligando tele...");    }

    @Override
    public
    void abrir ( ) {

    }
}
