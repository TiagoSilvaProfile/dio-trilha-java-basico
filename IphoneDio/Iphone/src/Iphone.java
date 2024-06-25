
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        
        // Testando funcionalidades
        iphone.reproduzir();
        iphone.pausar();
        iphone.parar();
        iphone.selecionarMusica("Musica 1");
        
        iphone.fazerChamada("123456789");
        iphone.receberChamada("987654321");
        iphone.enviarMensagem("123456789", "Olá!");

        iphone.navegar();
        iphone.abrirURL("www.exemplo.com");
        iphone.adicionarFavorito("www.exemplo.com");
    }
        
    // Métodos de ReprodutorMusical
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Música parada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada.");
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    // Métodos de NavegadorInternet
    @Override
    public void navegar() {
        System.out.println("Navegando na internet...");
    }

    @Override
    public void abrirURL(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void adicionarFavorito(String url) {
        System.out.println("Adicionando URL aos favoritos: " + url);
    }
}

