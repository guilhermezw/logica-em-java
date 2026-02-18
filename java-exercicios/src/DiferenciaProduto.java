
import java.util.Scanner;

public class DiferenciaProduto {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        int d = sc.nextInt();

        int diferencia = (a * b - c * d);

        System.out.println("A diferença entre os numeros e: " + diferencia);


    }
}
