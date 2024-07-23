package com.iphone;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao lançamento do iphone!");

        IPhone iPhone = new IPhone();
        // Aparelho telefonico
        System.out.println("------- Funções telefonicas -----------");
        iPhone.ligar( 912344568);
        iPhone.desligar();
        iPhone.atender();
        iPhone.rejeitar();

        // Reprodutor musical
        System.out.println("---------- Reprodutor musical -------------");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.proximo();
        iPhone.anterior();
        iPhone.interromper();
        // Navegador internet
        System.out.println("---------- Navagar internet -------------");
        iPhone.navegarPara("https://github.com/FlavioNogueira90/DIO_Desafios_java");
        iPhone.atualizarPagina();
        iPhone.sair();
    }
}