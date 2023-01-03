package EstruturasCondicionais.Controle;

import java.util.Scanner;

public class EstruturaIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();
        
        if(media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }
        if (media < 7 && media >= 5.0) {
            System.out.println("Você esta de recuperação!");
        }
        boolean mediareprovado = media < 4.5 && media >= 0;
        if (mediareprovado) {
            System.out.println("Você esta reprovado!");
        }
        
        entrada.close();
    }
}
