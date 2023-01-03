// Imports
import javax.swing.JOptionPane;

public class Atividade_04 {
    public static void main(String[] args) {
        int num1, num2, soma;

        // Entrada de Dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: ")); 
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número: "));

        // Processamento de Dados
        soma = num1 * num2;
        
        // Saída de Dados
        JOptionPane.showMessageDialog(null, "Os números digitados foram: \n" + num1 + "\n" + num2);
        JOptionPane.showMessageDialog(null, "A multiplicação dos números resulta em: " + soma);
    }
}