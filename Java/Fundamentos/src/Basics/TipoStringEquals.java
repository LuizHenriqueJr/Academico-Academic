package Basics;
import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        // Nesse caso será True
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1); // Resultado será false!
        System.out.println("2".equals(s1)); // Resultado true!

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.nextLine();
        System.out.println("2".equals(s2.trim())); // .trim retira os espaços que o usário pode acabar digitando.

        entrada.close();
    }
}
