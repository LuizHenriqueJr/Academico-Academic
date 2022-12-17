public class Inferencia {
    public static void main(String[] args) {
        double calculo; 
        // Ao utilizar a variável do tipo var, o java irá relacionar automaticamente com o tipo decorrente informado
        // Aqui ele irá informar como tipo inteiro
        var num1 = 3;

        // Aqui como tipo boolean (real)
        var num2 = 4.5;

        // Aqui como tipo String
        var result = "A soma desses números é ";

        calculo = num1 + num2;

        System.out.println(result + calculo);
    }
}