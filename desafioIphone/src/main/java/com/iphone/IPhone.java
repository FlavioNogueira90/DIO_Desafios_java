package com.iphone;

import com.iphone.funcoes.AparelhoTelefonico;
import com.iphone.funcoes.NavegadorInternet;
import com.iphone.funcoes.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(Integer numero) {
        System.out.println("Ligando para " + numero);
    }
    @Override
    public void desligar() {
        System.out.println("Chamada encerrada.");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    @Override
    public void rejeitar() {
        System.out.println("Chamada rejeitada.");
    }

    // Reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo...");
    }
    @Override
    public void pausar() {
        System.out.println("Pausado");
    }
    @Override
    public void interromper() {
        System.out.println("Reprodução interrompida");
    }
    @Override
    public void proximo() {
        System.out.println("Proxima música");
    }
    @Override
    public void anterior() {
        System.out.println("Musica anterior");
    }
    // Navegador internet
    @Override
    public void navegarPara(String url) {
        System.out.println("Navegando para " + url + "...");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
    @Override
    public void sair() {
        System.out.println("Encerrando sessão");
    }
}

