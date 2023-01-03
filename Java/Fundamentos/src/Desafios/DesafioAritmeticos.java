package Desafios;
public class DesafioAritmeticos {
    public static void main(String[] args) {
       int numA, denA, superiorA;
       int numB, denB, superiorB;
       int superior, inferior;
       int resultado;

       numA = (int) Math.pow(6*(3+2),2);
       denA = 3*2;

        numB = (1-5)*(2-7);
        denB = 2;

        superiorA = numA / denA;
        superiorB = (int) Math.pow(numB/denB, 2);

        superior = (int) Math.pow(superiorA - superiorB, 3);
        inferior = (int) Math.pow(10, 3);

        resultado = superior / inferior;

        System.out.println("O resultado é: " + resultado);
        
    }
}
