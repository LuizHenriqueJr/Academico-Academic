package Basics;
public class NotacaoPonto {
    public static void main(String[] args) {
        String a = "Olá Mundo X "
        .concat("Eu me chamo Junior!")
        .replace("X", "Tudo bem? ")
        .toUpperCase();

        System.out.println(a);

        String b = "Eu me chamo Junior e possuo  ";
        // Responsável por substituir os pontos informados por novas informações.
        b = b.replaceAll("possuo", "tenho");

        // Concatena e adiciona novas informações!
        b = b.concat("23 anos!!");

        // Faz com que todas as letras fiquem maiúsculas.
        b = b.toUpperCase();

        System.out.println(b);
    }
}
