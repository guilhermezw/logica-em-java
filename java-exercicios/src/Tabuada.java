import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para exibir a tabuada: ");
        int x = sc.nextInt();


        for (int i = 1; i <=x; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Tabuada do " + i);
                int multi = i * j;
                System.out.println(i + " x " + j + " = " + multi);
            }
            System.out.println();


        }
    }
}
