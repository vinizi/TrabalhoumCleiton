public class Aitivdade2 {
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 7.0;
        double nota3 = 9.0;
        double nota4 = 6.5;

        double media = calcularMedia(nota1, nota2, nota3, nota4);
        System.out.println("Média das notas: " + media);
    }

    public static double calcularMedia(double... notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}