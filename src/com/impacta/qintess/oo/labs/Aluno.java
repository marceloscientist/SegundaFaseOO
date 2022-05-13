package com.impacta.qintess.oo.labs;

public
class Aluno extends Pessoa {

    private float mensalidade;
    private String curso;

    public
    Aluno (String nome, int idade, char sexo, int numeroRG, String dataNasc, float mensalidade, String curso) {
        super(nome, idade, sexo, new RG(numeroRG, dataNasc));
        this.mensalidade = mensalidade;
        this.curso = curso;
    }

    public
    float getMensalidade ( ) {
        return mensalidade;
    }

    public
    void setMensalidade (float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public
    String getCurso ( ) {
        return curso;
    }

    public
    void setCurso (String curso) {
        this.curso = curso;
    }

    @Override
    public
    void falar (String fala) {
        System.out.println(this.getNome()+": " + fala);
    }

    @Override
    public
    void mostrarDados ( ) {
        System.out.println(
                "--- Aluno: "+this.getNome()+ " ---"+
                        "Idade: " +super.getIdade()+
                        "Sexo: " +super.getSexo()+
                        "Mensalidade: " +this.getMensalidade()+
                        "Curso: " +this.getCurso()+
                        "Número de RG: " +super.getRg().getNumero()+
                        "Data de Nascimento: " + super.getRg().getDataNasc()
        );
    }
}
