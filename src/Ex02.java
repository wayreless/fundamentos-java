import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = leTeclado.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = leTeclado.nextDouble();

        double soma = num1 + num2;
        double media = soma / 2;

        System.out.println("A sua média é: " + media);

    }
}

