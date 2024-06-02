
public class Namekuseijin extends PersonagemDragonBall {
    private int quantidadeEsferas;
    private boolean podeCurar;

    public Namekuseijin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    @Override
    public double calcularPoder() {
        return ki * (1 + (podeCurar ? 0.2 : 0));
    }

    public String fazerDesejo(String desejo) {
        return "Desejo em Namekusei: " + desejo.replace("a", "ka").replace("e", "ke").replace("i", "ki").replace("o", "ko").replace("u", "ku");
    }

    @Override
    public String toString() {
        return super.toString() + ", Quantidade de Esferas: " + quantidadeEsferas + ", Pode Curar: " + podeCurar;
    }
}
