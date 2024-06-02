
public class Terraqueo extends PersonagemDragonBall {
    private String pais;
    private String cidade;

    public Terraqueo(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, String pais, String cidade) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.pais = pais;
        this.cidade = cidade;
    }

    @Override
    public double calcularPoder() {
        return ki;
    }

    @Override
    public String toString() {
        return super.toString() + ", País: " + pais + ", Cidade: " + cidade;
    }
}
