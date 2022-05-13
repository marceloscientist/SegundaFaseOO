package com.impacta.qintess.oo.labs;

public
class Professor extends Pessoa {

    private float salario;
    private String disciplina;

    public
    Professor (String nome, int idade, char sexo, int numeroRG, String dataNasc, float salario, String disciplina) {
        super(nome, idade, sexo, new RG(numeroRG, dataNasc));
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public
    float getSalario ( ) {
        return salario;
    }

    public
    void setSalario (float salario) {
        this.salario = salario;
    }

    public
    String getDisciplina ( ) {
        return disciplina;
    }

    public
    void setDisciplina (String disciplina) {
        this.disciplina = disciplina;
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
                "--- Professor: "+super.getNome()+ " ---"+ "\n+"+
                "Idade: " +super.getIdade()+ "\n+"+
                "Sexo: " +super.getSexo()+ "\n+"+
                        "Salário: " +this.getSalario()+ "\n+"+
                        "Disciplina: " +this.getDisciplina()+ "\n+"+
                        "Número de RG: " +super.getRg().getNumero()+ "\n+"+
                        "Data de Nascimento: " + super.getRg().getDataNasc()
        );
    }
}
