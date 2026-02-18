import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Coordenadas:");
        System.out.println("Digite o X para as coodernadas de um plano:");
        double x = sc.nextDouble();
        System.out.println("Digite o Y para as coodernadas de um plano:");
        double y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Pertence ao Quadrante Q1");
        } else if (x < 0 && y > 0 ) {
            System.out.println("Pertence ao Quadrante Q2");
        } else if (x < 0 && y < 0){
            System.out.println("Pertence ao Quadrante Q3");
        } else if (x > 0 && y < 0){
            System.out.println("Pertence ao Quadrante Q4");
        } else if (x == 0 && y == 0) {
            System.out.println("O ponto esta Localizado na Origem");
        } else if (y == 0 && x!=0){
            System.out.println("O ponto esta Localizado no Eixo X");
        } else if (x == 0 && y!=0){
            System.out.println("O ponto esta Localizado no Eixo Y");
        }
    }
}
