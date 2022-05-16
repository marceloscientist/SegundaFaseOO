package com.impacta.qintess.inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public
class UsandoOsEletros {
    public static
    void main (String[] args) {
        List<Eletro> aparelhos = new ArrayList<Eletro>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual eletro G? T? M?");
        String tipo = scan.next() + scan.nextLine();
        do {
            switch (tipo) {
                case "G":
                    Eletro g = new Geladeira();
                    aparelhos.add(g);
                    break;
                case "T":
                    Eletro t = new Tele();
                    aparelhos.add(t);
                    break;
                case "M":
                    Eletro m = new Micro();
                    aparelhos.add(m);
                break;
                default:
                    System.out.println("Esta opção não existe");
                    break;
            }
            System.out.println("Qual eletro G? T? M?");
            System.out.println("X para sair");
            tipo = scan.next() + scan.nextLine();
        } while(!tipo.equals("X"));
        Eletro.ligarTudo(aparelhos);

        int numero = 0;
        for(Eletro aparelho: aparelhos) {
            numero++;
            aparelho.acionarTimer(numero);
        }
    }

}
