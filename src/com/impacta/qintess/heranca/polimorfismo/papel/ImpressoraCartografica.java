package com.impacta.qintess.heranca.polimorfismo.papel;

public
class ImpressoraCartografica {
    public static
    void main (String[] args) {
        Desenho d = new Desenho();
        Desenho q = new Quadrado();
        Desenho t = new Triangulo();
        d.imprimir();
        q.imprimir();
        t.imprimir();

        if(d instanceof Triangulo) {
            System.out.println("È sim");
        } else {
            System.out.println("É não");
        }
    }
}
