import java.util.Scanner;

public class SomaNumero {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int soma;

        System.out.println("Informe um numero A:");
        a = sc.nextInt();
        System.out.println("Informe um numero B:");
        b = sc.nextInt();

        soma = a + b;

        System.out.print("O valor da soma entre A e B: " + soma);
    }


}
