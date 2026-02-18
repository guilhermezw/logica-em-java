import java.util.Locale;
import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double renda;
        double impostoRenda;

        System.out.println("Sistema Tributario de Lisarb:");
        System.out.println("Digite abaixo sua renda mensal para imposto de renda:");
        renda = sc.nextDouble();

        if (renda <= 2000.0){
            System.out.println("Voce esta insento do imposto de renda");
        } else if (renda <= 3000.0) {
            System.out.println("Voce terá que pagar ao imposto de renda:");
            impostoRenda = (renda - 2000.0) * 0.08;
            System.out.printf("O valor final do imposto de renda e de: R$ %.2f", impostoRenda);
        } else if (renda <= 4500.0) {
            System.out.println("Voce terá que pagar ao imposto de renda:");
            impostoRenda = (renda - 3000.0) * 0.18 + 1000 * 0.08;
            System.out.printf("O valor final do imposto de renda e de: R$ %.2f", impostoRenda);
        } else {
            System.out.println("Voce terá que pagar ao imposto de renda:");
            impostoRenda = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("O valor final do imposto de renda e de: R$ %.2f", impostoRenda);
        }

        sc.close();

    }
}
