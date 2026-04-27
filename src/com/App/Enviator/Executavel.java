package com.App.Enviator;

public class Executavel {
    public static void main(String[] args) {

        TornarOnline online = new TornarOnline();
        TornarOnline.estado();

        System.out.println(" ");

        SelecionarContato selecionado = new SelecionarContato();
        SelecionarContato.selecionarContato();


        ReceberMensagem receber = new ReceberMensagem();
        receber.receberMensagem();



        EnviarMensagem enviar = new EnviarMensagem();
        enviar.enviarMensagem();



    }
}
