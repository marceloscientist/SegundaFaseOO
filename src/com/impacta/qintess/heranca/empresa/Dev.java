package com.impacta.qintess.heranca.empresa;

public
class Dev extends Funcionario {
    public
    Dev (String linguagemDeProgramacao, String sistemaOperacional, Double salario) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
        this.sistemaOperacional = sistemaOperacional;
        this.salario = salario;
    }

    public
    Dev (String nome, String email, String linguagemDeProgramacao, String sistemaOperacional, Double salario) {
        super(nome, email);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
        this.sistemaOperacional = sistemaOperacional;
        this.salario = salario;
    }

    String linguagemDeProgramacao;
    String sistemaOperacional;
    Double salario;
}
