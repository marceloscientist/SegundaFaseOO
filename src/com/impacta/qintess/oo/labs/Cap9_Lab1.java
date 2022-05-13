package com.impacta.qintess.oo.labs;
import com.impacta.qintess.oo.labs.utils.quebraLinha;

import java.util.Arrays;

public
class Cap9_Lab1 {

    public static
    void main (String[] args) {
        Pessoa claudia = new Aluno("Claudia", 22, 'F',
                415678912, "12/08/1990", 799.0F, "Administração");
        Pessoa manuel = new Aluno("Manuel", 19, 'M',
                521234567, "15/06/1993", 1099.0F, "Ciência da Computação");
        Professor rafael = new Professor("Rafael", 38, 'M',
                415678912, "05/02/1974", 2500.0F, "Português");

        Pessoa[] alunos = {rafael, claudia};

        quebraLinha.quebraUmaLinha();
        for(Pessoa aluno : alunos) {
            rafael.falar(aluno.getNome()+"?");
            aluno.falar("Presente");
        }

        quebraLinha.quebraDuasLinhas();
        rafael.mostrarDados();
        quebraLinha.quebraUmaLinha();
        Arrays.stream(alunos).forEach(pessoa -> {
            pessoa.mostrarDados();
            quebraLinha.quebraUmaLinha();
        });
    }
}
