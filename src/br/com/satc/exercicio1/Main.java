package br.com.satc.exercicio1;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
            System.out.println("Escolha um numero e o programa irá imprimir todos os outros até ele");
            int N = entrada.nextInt();
            for (int i = 0; i <= N; i++) {
                System.out.println(i);
                
            }
            
    }
    
}
