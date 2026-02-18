import java.util.Scanner;

public class Intervalos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N:");
        int n = sc.nextInt();
        int acrescentador = 1;
        int in = 0;
        int out = 0;

        for (int i = 0; i<n; i++){
            System.out.print("\n");
            System.out.println("Informe o valor de X:");
            int x = sc.nextInt();
            if (x <=10 || x >=20){
                System.out.println("Número esta fora da sequencia.");
                out += acrescentador;
            }else {
                in += acrescentador;
                System.out.println("Número esta dentro da sequencia");
            }
        }

        System.out.print("\n");
        System.out.println("Numeros dentro da sequencia IN: " + in);
        System.out.println("Numeros fora da sequencia OUT: " + out);
    }
}
