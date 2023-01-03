package Desafios;
import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {
        int num1, num2;
        String sinal;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro número "));
        sinal = (JOptionPane.showInputDialog("Digite uma Operação "));

        int resultado = "+".equals(sinal) ? num1 + num2 : 0; 
        resultado = "-".equals(sinal) ? num1 - num2 : resultado;
        resultado = "*".equals(sinal) ? num1 * num2 : resultado;
        resultado = "/".equals(sinal) ? num1 / num2 : resultado;
        resultado = "%".equals(sinal) ? num1 % num2 : resultado;

        JOptionPane.showMessageDialog(null, "O Resultado do calculo entre " + num1 + sinal + num2 + " é: " + resultado);
    }
}
