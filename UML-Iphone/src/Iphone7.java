public class Iphone7 implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Ligando seu iPhone7");

    }

    @Override
    public void desligar() {
        System.out.println("Desligando seu iPhone7");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada telefônica com seu iPhone7");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada telefônica no seu iPhone7");
    }

    @Override
    public void enviarSMS() {

    }

    @Override
    public void receberSMS() {

    }

    @Override
    public void abrirPaginaWeb() {
        System.out.println("Abrindo página web no seu navedor Safari");
    }

    @Override
    public void fecharPaginaWeb() {
        System.out.println("Fechando página web no seu navedor Safari");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo a sua música favorita");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a sua música favorita");
    }



}