package com.App.Enviator;

import java.util.Scanner;

public class EnviarMensagem {
    public void enviarMensagem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua MSG:");
        String mensagem = sc.nextLine();
        System.out.println("Mensagem ENVIADA!");
    }
}
