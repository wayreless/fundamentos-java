import java.util.Scanner;

public class TipoReferenciadoString {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        String nome = leTeclado.nextLine();
        leTeclado.nextLine();
        int a = leTeclado.nextInt();
        double nota = leTeclado.nextDouble();

        System.out.println(nome);
        System.out.println(a);
    }
}
