package com.impacta.qintess.heranca.polimorfismo.instancing;

public
class InstanceOfStringSample {
    public static
    void main (String[] args) {
        String a = "Um valor qlqr";
        if(a instanceof String) {
            System.out.println("È sim");
        } else {
            System.out.println("É não");
        }

    }
}
