package Desafios;
import java.util.Scanner;

public class PraticandoConversoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String num1, num2, num3;

        // Entrada de Dados
        System.out.println("Quanto o funcionário Luiz Henrique recebeu no mês de Janeiro? ");
        num1 = entrada.nextLine().replace(",", "."); 
            // Usar o replace da ao usuário a possibilidade de utilizar virgulas, já que o Java fará a troca automaticamente.
        System.out.println("Quanto o funcionário Luiz Henrique recebeu no mês de Fevereiro? ");
        num2 = entrada.nextLine().replace(",", ".");
        System.out.println("Quanto o funcionário Luiz Henrique recebeu no mês de Março? ");
        num3 = entrada.nextLine().replace(",", ".");

        // Processamento de Dados
        double SalarioJaneiro = Double.parseDouble(num1);
        double SalarioFevereiro = Double.parseDouble(num2);
        double SalarioMarco = Double.parseDouble(num3);
        double media;

        media = (SalarioJaneiro + SalarioFevereiro + SalarioMarco) /3;

        System.out.println("A média Salarial de Luiz Henrique é: R$" + media);

        entrada.close(); 
    }
}