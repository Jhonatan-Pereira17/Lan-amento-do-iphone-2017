public class App {

    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();

        // Testando funcionalidades de reprodutor musical
        meuIPhone.selecionarMusica("Sonne - Rammstein");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Testando funcionalidades de aparelho telefônico
        meuIPhone.ligar("83999618539");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando funcionalidades de navegador na internet
        meuIPhone.exibirPagina("https://www.google.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
