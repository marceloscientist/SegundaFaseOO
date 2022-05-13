package com.impacta.qintess.heranca.empresa;

public
class Funcionario {
    protected String nome;
    protected String email;
    int idade;
    char genero;

    public
    Funcionario () {
    }

    public
    Funcionario (String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public
    Funcionario (String nome) {
    }
}
