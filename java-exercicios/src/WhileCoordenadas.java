import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class WhileCoordenadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Coordenadas:");
        System.out.println("Digite o X para as coodernadas de um plano:");
        double x = sc.nextDouble();
        System.out.println("Digite o Y para as coodernadas de um plano:");
        double y = sc.nextDouble();


        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Pertence ao Quadrante Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Pertence ao Quadrante Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Pertence ao Quadrante Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("Pertence ao Quadrante Q4");
            }

            System.out.print("\n");
            System.out.println("Coordenadas:");
            System.out.println("Digite o X para as coodernadas de um plano:");
             x = sc.nextDouble();
            System.out.println("Digite o Y para as coodernadas de um plano:");
             y = sc.nextDouble();

        }




    }
}
