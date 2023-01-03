public class Atividade_02 {
    public static void main(String[] args) {
        int a, b, c, r1, r2, q1, q2, v;
        a = 10; b = 20; c = 3;
        q1 = b / a;
        q2 = b / 3;
        r1 = a % c;
        r2 = b % c;
        v = q1 + q2 + r1  + r2;
        System.out.print("O valor de V é: " + v);
    }
}
