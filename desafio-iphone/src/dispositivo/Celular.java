package dispositivo;

public class Celular {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.selecionarMusica("Minha Música Favorita");
        meuIphone.tocar();
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.iniciarCorreioVoz();

    }
}
