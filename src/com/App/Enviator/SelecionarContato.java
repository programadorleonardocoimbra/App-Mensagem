package com.App.Enviator;

import java.util.Scanner;

public class SelecionarContato {
   static void selecionarContato() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do contato: ");
        String nome = sc.nextLine();
        System.out.println("Contato selecionado: " + nome);
        System.out.println(" ");
    }
}
