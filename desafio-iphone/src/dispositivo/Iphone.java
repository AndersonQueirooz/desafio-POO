package dispositivo;

import servicos.Funções;

public class Iphone extends Funções {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        meuIphone.selecionarMusica("Minha Música Favorita");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
