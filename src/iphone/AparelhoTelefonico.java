package iphone;

public interface AparelhoTelefonico {
    void realizarChamada(String numero);
    void receberChamada(String numero);
    void encerrarChamada();
    void bloquearChamada();
    void ajustarVolumeChamada(int volume);
}
