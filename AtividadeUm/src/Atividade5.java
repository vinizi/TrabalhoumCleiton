public class Atividade5 {
    public static void main(String[] args) {
        double temperaturaCelsius = 25.0;

        double temperaturaFahrenheit = converterCelsiusParaFahrenheit(temperaturaCelsius);
        double temperaturaKelvin = converterCelsiusParaKelvin(temperaturaCelsius);

        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
        System.out.println("Temperatura em Kelvin: " + temperaturaKelvin);
    }
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static double converterCelsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }
}