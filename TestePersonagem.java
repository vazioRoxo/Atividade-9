
public class TestePersonagem {
    public static void main(String[] args) {
        Terraqueo kuririn = PersonagemFactory.criarKuririn();
        Sayajin goku = PersonagemFactory.criarGoku();
        Sayajin gohan = PersonagemFactory.criarGohan();
        Namekuseijin dende = PersonagemFactory.criarDende();

        System.out.println(kuririn);
        System.out.println("Poder: " + kuririn.calcularPoder());

        System.out.println(goku);
        System.out.println("Poder: " + goku.calcularPoder());

        System.out.println(gohan);
        System.out.println("Poder: " + gohan.calcularPoder());

        System.out.println(dende);
        System.out.println("Poder: " + dende.calcularPoder());

        goku.transformar(5);

        gohan.transformar(5);
        gohan.transformar(3);

        String desejo = "Quero ser o mais forte";
        String desejoNamekusei = dende.fazerDesejo(desejo);
        System.out.println(desejoNamekusei);
    }
}
