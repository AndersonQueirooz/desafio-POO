package dispositivo;

import servicos.AparelhoTelefonico;
import servicos.NavegadorInternet;
import servicos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no iPhone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica + " no iPhone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " no iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero + " ");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação no Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone");
    }

    

}
