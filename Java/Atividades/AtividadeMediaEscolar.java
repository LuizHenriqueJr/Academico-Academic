public class AtividadeMediaEscolar {
    public static void main(String[] args) {
        double bi1 = 5.0 , bi2 = 4.5 , bi3 = 9.0, mediatrabalhos;
        mediatrabalhos = (bi1 + bi2 + bi3) / 3.0;
        System.out.println("Média de trabalhos: " + mediatrabalhos);

        if (mediatrabalhos >= 6.0) {
            System.out.println("Você foi aprovado.");
        }
        else {
            System.out.println("Você foi reprovado.");
        }
    }
}