

public class Soma {

    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double somar(int a, double b) {
        return a + b;
    }
    public double somar(double a, int b) {
        return a + b;
    }

    public int somar(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

    public double somar(double... numeros) {
        double soma = 0.0;
        for (double num : numeros) {
            soma += num;
        }
        return soma;
    }

    public static void main(String[] args) {
        Soma calculator = new Soma();

        int somaInteiros = calculator.somar(5, 10);
        System.out.println("Soma de dois inteiros: " + somaInteiros);

        int somaTresInteiros = calculator.somar(1, 2, 3);
        System.out.println("Soma de três inteiros: " + somaTresInteiros);

        double somaDecimais = calculator.somar(2.5, 3.5);
        System.out.println("Soma de dois números decimais: " + somaDecimais);

        double somaIntDecimal = calculator.somar(5, 4.5);
        System.out.println("Soma de um inteiro e um número decimal: " + somaIntDecimal);

        double somaDecimalInt = calculator.somar(3.5, 2);
        System.out.println("Soma de um número decimal e um inteiro: " + somaDecimalInt);

        int somaSerieInteiros = calculator.somar(1, 2, 3, 4, 5);
        System.out.println("Soma de uma série de inteiros: " + somaSerieInteiros);

        double somaSerieDecimais = calculator.somar(1.1, 2.2, 3.3);
        System.out.println("Soma de uma série de números decimais: " + somaSerieDecimais);
    }
}
