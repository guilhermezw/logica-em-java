
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class RaioCirculo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Informe o raio do circulo:");
        double raio = sc.nextDouble();

        double area = pi * Math.pow(raio,2);

        System.out.println("O valor da area do circulo e de: " + area);

    }
}



