import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        float a,b;

        while(opcao != 2){
            System.out.print("\n\n");
            System.out.print("Maior Número:\n");
            System.out.print("1-Iniciar\n");
            System.out.print("2-Sair\n");
            System.out.print("Informe abaixo:\n");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Informe um número A:\n");
                    a = sc.nextFloat();
                    System.out.print("Informe um número B:\n");
                    b = sc.nextFloat();
                    if(a > b){
                        System.out.print("O valor de A: " + a + " e maior que valor B: " + b);
                    }
                    else if (a == b) {
                        System.out.print("O valor de A: " + a + " e igual ao valor B: " + b);
                    }
                    else {
                        System.out.print("O valor de B: " + b + " e maior que valor A: " + a);
                    }
                    break;

                case 2:
                    System.out.print("Saindo...\n");
                    break;
                default:
                    System.out.print("Opção Invalida.Informe um numero 1 a 2");
            }
        }

    }
}