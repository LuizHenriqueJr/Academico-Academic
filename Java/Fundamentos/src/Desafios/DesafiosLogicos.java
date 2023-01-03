package Desafios;
public class DesafiosLogicos {
    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = true;
        boolean shopping, sorvete;

        // Condição 1
        System.out.println("O trabalho de terça-feira foi concluido? \n" + trabalho1);
        System.out.println("O trabalho de quinta-feira foi concluido? \n" + trabalho2);
        shopping = true;
        System.out.println("A família foi comprar o Playstation 5? \n" + shopping);
        System.out.println("A família foi comprar o Playstation 4? \n" + !shopping);
        sorvete = true;
        System.out.println("A família comemorou o sucesso com um sorvete? \n" + sorvete);

        // Condição 1 if / else
        System.out.println("O trabalho de terça-feira foi concluido? \n" + trabalho1);
        System.out.println("O trabalho de quinta-feira foi concluido? \n" + trabalho2);
        if (trabalho1 = true) {
            System.out.println("A família foi ao Shopping comprar o Playstation 5");
        }
        else {
            System.out.println("A família foi ao Shopping comprar o Playstation 4");
        }
        sorvete = true;
        System.out.println("A família comemorou o sucesso com um sorvete? \n" + sorvete);

        // Condição 2
        System.out.println("O trabalho de terça-feira foi concluido? \n" + !trabalho1);
        System.out.println("O trabalho de quinta-feira foi concluido? \n" + trabalho2);
        shopping = trabalho1 || trabalho2;
        System.out.println("A família foi ao Shopping comprar o Playstation 5? \n" + !shopping);
        System.out.println("A família foi ao Shopping comprar o Playstation 4? \n" + shopping);
        sorvete = true;
        System.out.println("A família comemorou o sucesso com um sorvete? \n" + sorvete);

        // Condição 3
        System.out.println("O trabalho de terça-feira foi concluido? \n" + !trabalho1);
        System.out.println("O trabalho de quinta-feira foi concluido? \n" + !trabalho2);
        shopping = !trabalho1 && trabalho2;
        System.out.println("A família foi ao Shopping comprar o Playstation 5? \n" + shopping);
        System.out.println("A família foi ao Shopping comprar o Playstation 4? \n" + shopping);
        sorvete = !true;
        System.out.println("A família comemorou o sucesso com um sorvete? \n" + sorvete);

    }
}
