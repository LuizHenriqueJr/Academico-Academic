import javax.swing.JOptionPane;

public class CalculoDeSalario {
    public static void main(String[] args) {
        double aumento, salarioatual, porcentagem, salariofuturo;

        salarioatual = Double.parseDouble
        (JOptionPane.showInputDialog("Quanto a funcionária Jessyca recebe? "));
        aumento = Double.parseDouble
        (JOptionPane.showInputDialog("Quantos por cento ela terá de aumento? "));

        porcentagem = (aumento * salarioatual) /100;
        salariofuturo = salarioatual + porcentagem;

        JOptionPane.showMessageDialog(null,"Atualmente Jessyca recebe: " + salarioatual);
        JOptionPane.showMessageDialog
        (null,"Jessyca terá um aumento de: " + porcentagem);
        JOptionPane.showMessageDialog
        (null, "O salário futuro de Jessyca será de: " + salariofuturo);
    }
}
