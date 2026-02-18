import java.util.Locale;
import java.util.Scanner;

public class MediaPonderadaFor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();

        for(int i = 0; i<n ; i++){
            System.out.print("\n");
            System.out.println("Digite o numero A: ");
            double a = sc.nextDouble();
            System.out.println("Digite o numero B: ");
            double b = sc.nextDouble();
            System.out.println("Digite o numero C: ");
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("Media Ponderada e: %.1f%n", media);
            }
        }
    }

