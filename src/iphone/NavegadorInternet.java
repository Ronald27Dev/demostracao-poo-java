package iphone;

public interface NavegadorInternet {
    void abrirPaginaWeb(String url);
    void fecharPaginaWeb();
    void navegarParaUrl(String url);
    void adicionarAba();
    void removerAba();
    void exibirConteudo();
}
