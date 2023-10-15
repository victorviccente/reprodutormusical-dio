public class ReprodutorMusical {
    public void play() {
        // Implementação para iniciar a reprodução de música
    }

    public void pause() {
        // Implementação para pausar a reprodução de música
    }

    public void stop() {
        // Implementação para parar a reprodução de música
    }
}

public class AparelhoTelefonico {
    public void fazerLigacao(String numero) {
        // Implementação para fazer uma ligação
    }

    public void receberLigacao(String numero) {
        // Implementação para receber uma ligação
    }

    public void enviarMensagem(String mensagem) {
        // Implementação para enviar uma mensagem
    }

    public void receberMensagem(String mensagem) {
        // Implementação para receber uma mensagem
    }
}

public class NavegadorInternet {
    public void abrirPagina(String url) {
        // Implementação para abrir uma página na Internet
    }

    public void fecharPagina() {
        // Implementação para fechar a página atual
    }

    public void navegarAtras() {
        // Implementação para navegar para a página anterior
    }

    public void navegarFrente() {
        // Implementação para navegar para a próxima página
    }
}

public class IPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public IPhone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }
}
