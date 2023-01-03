package Operadores;
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        var a = 34;
        var b = 56;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        
        // A divisão entre dois números inteiros tem como resultado, um número inteiro.
        System.out.println(a / b);
        // Conseguimos contornar isso utilizando o Cast:
        System.out.println(a / (double) b);

        // Operador Modulo (Resto da Divisão)
        System.out.println(a % b);

        var c = 2.56;
        var d = 55.76;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d); 
        
        // Operador Modulo (Resto da Divisão)
        System.out.println(c % d);

    }
}