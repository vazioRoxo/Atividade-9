
public class Sayajin extends PersonagemDragonBall implements Transformavel {
    private int nivelMaximoSSJ;
    private boolean temRabo;

    public Sayajin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int nivelMaximoSSJ, boolean temRabo) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = temRabo;
    }

    @Override
    public double calcularPoder() {
        return ki * (1 + nivelMaximoSSJ * 0.1);
    }

    @Override
    public void transformar(int nivel) {
        if (nivel >= 1 && nivel <= 3) {
            System.out.println(nome + " transformou para super sayajin nível " + nivel);
        } else if ((nome.equals("Goku") || nome.equals("Vegeta")) && (nivel == 4 || nivel == 5)) {
            System.out.println(nome + " transformou para super sayajin nível " + nivel);
        } else {
            System.out.println("Não foi possível transformar esse sayajin");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Nível Máximo SSJ: " + nivelMaximoSSJ + ", Tem Rabo: " + temRabo;
    }
}

