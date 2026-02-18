import java.util.Scanner;

public class DivisaoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de numero N");
        int n = sc.nextInt();

        for(int i = 0 ; i < n; i++){
            System.out.print("\n");
            System.out.println("Informe o número A:");
            double a = sc.nextInt();
            System.out.println("Informe o número B:");
            double b = sc.nextInt();

            if (b == 0){
                System.out.println("Divisão Impossivel");
            } else {
                double divisao = a / b;
                System.out.printf("A divisao entre A e B e: %.2f",divisao);
                System.out.print("\n");
            }
        }
    }
}
