package iphone;

/**
 * Classe de execução do projeto
 *
 * @author Ronald Rodrigues
 * @since 08-04-2025
 */
public class Main {

    /**
     * Metodo principal para execução
     * @param args
     */
    public static void main(String[] args) {
        // Iniciando objeto sobre iphone
        Iphone iphone = new Iphone("Iphone 2007", "IOS 1", 128);

        iphone.exibirInformacoes();

        // Executa metodos da interface AparelhoTelefonico
        iphone.realizarChamada("11234567890");
        iphone.ajustarVolumeChamada(5);
        iphone.encerrarChamada();
        iphone.receberChamada("11234567890");
        iphone.bloquearChamada();

        // Executa metodos da interface ReprodutorMusical
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.pararMusica();
        iphone.avancarMusica();
        iphone.retrocederMusica();
        iphone.ajustarVolume();

        // Executa metodos da interface NavegadorInternet
        iphone.abrirPaginaWeb("google.com");
        iphone.navegarParaUrl("oracle.com");
        iphone.fecharPaginaWeb();
        iphone.adicionarAba();
        iphone.exibirConteudo();
        iphone.removerAba();
    }
}
