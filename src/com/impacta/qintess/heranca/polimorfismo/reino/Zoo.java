package com.impacta.qintess.heranca.polimorfismo.reino;

public
class Zoo {
    public static
    void main (String[] args) {
        Animal animal = new Animal();
        animal.comer();
        Animal zebra = new Zebra();
        zebra.comer();
        Animal leao = new Leao();
        leao.comer();
    }
}
