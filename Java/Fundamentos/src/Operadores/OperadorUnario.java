package Operadores;
public class OperadorUnario {
    public static void main(String[] args) {
        int a = 5, b = 33;
        a++;
        b--; 
        ++a;
        --b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
    }
}