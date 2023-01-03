package Basics;
public class Temperatura {
    public static void main(String[] args) {
        double fahrenheit = 97;
        final int SUB = 32;
        double fahresult; 
        final double MULT = 5.0 / 9.0;
        double celsius;
        
        // (°F - 3) x 5/9 = C°
        fahresult = fahrenheit - SUB;

        celsius = fahresult * MULT;

        System.out.println("Resultado = " + celsius + " °C");

    }
}
