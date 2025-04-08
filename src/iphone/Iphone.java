package iphone;

/**
 * Classe do Iphone implementado as suas interface
 *
 * @author Ronald Rodrigues
 * @since 08-05-2025
 */
public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{
    String modelo;
    String sistemaOperacional;
    int capacidadeDeArmazenamento;

    public Iphone(String novoModelo, String novoSO, int armazenamento) {
        this.modelo = novoModelo;
        this.sistemaOperacional = novoSO;
        this.capacidadeDeArmazenamento = armazenamento;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Sistema Operacional: " + this.sistemaOperacional);
        System.out.println("Armazenamento: " + this.capacidadeDeArmazenamento);
    }

    @Override
    public void realizarChamada(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("O numero: " + numero + " esta te ligando");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada Encerrada");
    }

    @Override
    public void bloquearChamada() {
        System.out.println("A chamada foi encerrada");
    }

    @Override
    public void ajustarVolumeChamada(int volume) {
        System.out.println("Volume ajustado para : " + volume);
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando a Musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a Musica");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando a Musica");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando a Musica");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo a Musica");
    }

    @Override
    public void ajustarVolume() {
        System.out.println("Ajustando o Volume");
    }


    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo pagina da web: " + url);
    }

    @Override
    public void fecharPaginaWeb() {
        System.out.println("Fechando pagina web");
    }

    @Override
    public void navegarParaUrl(String url) {
        System.out.println("Atualizando pagina para url: " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando Aba");
    }

    @Override
    public void removerAba() {
        System.out.println("Removendo Aba");
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Exibindo Conteudo");
    }
}
