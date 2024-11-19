//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double precoOriginal = 50;
        double desconto = 20.0; // Desconto em porcentagem
        double imposto = 15.0; // Imposto em porcentagem

        double precoComDesconto = calcularDesconto(precoOriginal, desconto);

        System.out.println("Preço original: " + precoOriginal);
        System.out.println("Desconto aplicado: " + desconto + "%");
        System.out.println("Preço com desconto: " + precoComDesconto);

        double precoComImposto = calcularImposto(precoComDesconto, imposto);
        System.out.println("Imposto aplicado: " + imposto + "%");
        System.out.println("Preço final com imposto: " + precoComImposto);
    }

    public static double calcularDesconto(double precoOriginal, double desconto) {
        return precoOriginal - (precoOriginal * (desconto / 100));
    }
    public static double calcularImposto(double precoComDesconto, double imposto) {
        return precoComDesconto + (precoComDesconto * (imposto / 100));
    }
}
