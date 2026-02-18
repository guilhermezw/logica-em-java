import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int numero;

        while(opcao != 2){
            System.out.print("\n\n");
            System.out.print("Par ou Ímpar:\n");
            System.out.print("1-Iniciar\n");
            System.out.print("2-Sair\n");
            System.out.print("Informe abaixo:\n");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Informe um número:\n");
                    numero = sc.nextInt();
                    if(numero % 2 == 0){
                        System.out.print("Numero Par\n");
                    }
                    else{
                        System.out.print("Numero e Ímpar\n");
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