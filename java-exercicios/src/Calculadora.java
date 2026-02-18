import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        int opcao = 0;
        float a ,b , c;
        double delta,x1,x2;
        int numero;
        Scanner sc = new Scanner(System.in);

        while(opcao != 7){
            System.out.print("\n\n");
            System.out.print("Menu Calculadora:\n");
            System.out.print("1 |Adição\n");
            System.out.print("2 |Subtração\n");
            System.out.print("3 |Multiplicação\n");
            System.out.print("4 |Divisão\n");
            System.out.print("5 |Delta-Bhaskara\n");
            System.out.print("6 |Par | Impar\n");
            System.out.print("7-Sair\n");
            System.out.print("Informe um opção abaixo:\n");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Informe valor A:\n");
                    a = sc.nextFloat();
                    System.out.print("Informe o valor de B:\n");
                    b = sc.nextFloat();
                    float soma = a + b;
                    System.out.printf("O valor da soma entre A e b e:\n" + soma);
                    break;
                case 2:
                    System.out.print("Informe valor A:\n");
                    a = sc.nextFloat();
                    System.out.print("Informe o valor de B:\n");
                    b = sc.nextFloat();
                    float subtracao = a - b;
                    System.out.print("O valor da subtração entre A e B:\n" + subtracao);
                    break;
                case 3:
                    System.out.print("Informe valor A:\n");
                    a = sc.nextFloat();
                    System.out.print("Informe o valor de B:\n");
                    b = sc.nextFloat();
                    float multiplicacao = a * b;
                    System.out.printf("O valor da multiplicação entre A e B:\n" + multiplicacao);
                    break;
                case 4:
                    System.out.print("Informe valor A:\n");
                    a = sc.nextFloat();
                    System.out.print("Informe o valor de B:\n");
                    b = sc.nextFloat();
                    if(b == 0){
                        System.out.print("Error. Divisão por 0.");
                    }
                    else{
                        float divisao = a / b;
                        System.out.print("O valor da divisão entre A e B:\n" + divisao);
                    }
                    break;
                case 5:
                    System.out.print("Informe o valor de A:\n");
                    a = sc.nextFloat();
                    System.out.print("Informe o valor de B:\n");
                    b = sc.nextFloat();
                    System.out.print("Informe o valor de C:\n");
                    c = sc.nextFloat();
                    delta = Math.pow(b, 2) - 4 * a * c;
                    if(delta > 0){
                        System.out.print("Essa equação terá duas raízes reais e distintas.\n");
                        System.out.printf("Valor de delta e: %.2f\n", delta);
                        System.out.print("Bhaskra:\n");
                        x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.printf("X1: %.2f\n",x1);
                        System.out.printf("X2: %.2f\n",x2);
                    }
                    else if(delta == 0){
                        System.out.print("Essa equação terá duas raízes reais e iguais.\n");
                        x1 = -b / (2 * a);
                        System.out.printf("Valor de delta é: %.2f\n", delta);
                        System.out.printf("X1 = X2 = %.2f\n", x1);
                    }
                    else{
                        System.out.print("Essa equação terá duas raízes complexas conjugadas.\n");
                        System.out.print("Não é possível calcular raízes reais.\n");
                    }
                    break;
                case 6:
                    System.out.print("Informe um número:\n");
                    numero = sc.nextInt();
                    if(numero % 2 == 0){
                        System.out.print("Numero Par\n");
                    }
                    else{
                        System.out.print("Numero e Ímpar\n");
                    }
                    break;
                case 7:
                    System.out.print("Saindo...\n");
                    break;
                default:
                    System.out.print("Opção inválida. Por favor, digite um número entre 1 a 6\n");
            }
        }
    }
}