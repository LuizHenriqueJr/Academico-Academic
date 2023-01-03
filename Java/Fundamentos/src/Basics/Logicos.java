package Basics;
public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 13 > 55;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        // Tabela Verdade
        System.out.println("\n Tabela Verdade AND &&");
        System.out.println(true && true);
        System.out.println(true && false);
        // System.out.println(false && true);
        // System.out.println(false && false);

        System.out.println("\n Tabela Verdade OR ||");
       // System.out.println(true || true);
       // System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\n Tabela Verdade XOR ^");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
    }
}