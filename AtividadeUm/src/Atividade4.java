public class Atividade4 {
    public static void main(String[] args) {
        int numero = 5;

        int fatorial = calcularFatorial(numero);

        System.out.println("Fatorial de " + numero + " é: " + fatorial);
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}