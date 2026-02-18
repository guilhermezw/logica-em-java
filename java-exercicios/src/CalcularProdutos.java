import java.util.Locale;
import java.util.Scanner;

public class CalcularProdutos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da peça 1:");
        int codigoPc = sc.nextInt();
        System.out.println("Digite a quantidade da peça 1:");
        int quantidadePc = sc.nextInt();
        System.out.println("Digite o valor da peça 1:");
        double valorPc = sc.nextDouble();
        System.out.print("\n");

        System.out.println("Digite o número da peça 2:");
        int codigoPc2 = sc.nextInt();
        System.out.println("Digite a quantidade da peça 2:");
        int quantidadePc2 = sc.nextInt();
        System.out.println("Digite o valor da peça 2:");
        double valorPc2 = sc.nextDouble();

        double valorFinal = quantidadePc * valorPc + quantidadePc2 * valorPc2;

        System.out.printf("\nO valor a pagar é: R$ %.2f\n", valorFinal);

        sc.close();
    }
}
