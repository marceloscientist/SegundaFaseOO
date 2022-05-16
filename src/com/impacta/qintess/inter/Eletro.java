package com.impacta.qintess.inter;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public interface Eletro {
   Scanner scan = new Scanner(System.in);

   void ligar ();
   void desligar ( );
   void abrir ();
   static void ligarTudo (List<Eletro> eletros) {
      for(Eletro eletro: eletros) {
         eletro.ligar();
      }
   }
   default void acionarTimer(int minutos) {
      try {
         Thread.sleep(4000 * minutos);
      } catch (Exception e) {

      }
      desligar();
   }

}
