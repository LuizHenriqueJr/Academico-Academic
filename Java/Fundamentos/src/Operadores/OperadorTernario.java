package Operadores;
public class OperadorTernario {
    public static void main(String[] args) {
        double media = 4.9;
        
        String resultado = media <= 4.7 ? "reprovado." : "em conselho";
        resultado = media >= 5.0 ? "recuperação." : resultado;
        resultado = media >= 7.0 ? "aprovado" : resultado;

        System.out.println("O aluno está " + resultado);
    } 
}