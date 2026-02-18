import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.pow;

public class MiniCaixaDeFerramenta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int opcao;
        double temperatura;

        do {
            System.out.print("\n");
            System.out.println("Mini Caixa de Ferramentas:");
            System.out.println("[1] - Calculadora de IMC");
            System.out.println("[2] - Verificador de Ano Bissexto");
            System.out.println("[3] - Conversor de Temperatura (Celsius <-> Fahrenheit)");
            System.out.println("[4] - Exit");
            System.out.print("Informe a abaixo:");
            opcao = sc.nextInt();
            System.out.println("\n");

            switch (opcao){
                case 1:
                    System.out.print("Digite o seu peso:");
                    double peso = sc.nextDouble();
                    System.out.print("Digite sua altura: ");
                    double altura = sc.nextDouble();

                    while (peso <=0 || altura <=0){
                        System.out.println("Digite um valor valido!");
                        System.out.print("Digite o seu peso:");
                        peso = sc.nextDouble();
                        System.out.print("Digite sua altura: ");
                        altura = sc.nextDouble();
                    }

                    double imc = peso / (altura * altura);

                    if (imc < 18.5){
                        System.out.printf("Seu IMC e: %.2f\n",imc);
                        System.out.println("Você se encontrar Abaixo do Peso!");
                    } else if (imc <= 24.9 ) {
                        System.out.printf("Seu IMC e: %.2f\n",imc );
                        System.out.println("Você se encontrar Peso Normal!");
                    } else if (imc <= 29.9) {
                        System.out.printf("Seu IMC e: %.2f\n",imc);
                        System.out.println("Você se encontrar com Sobrepeso!");
                    } else if (imc <= 34.9) {
                        System.out.printf("Seu IMC e: %.2f\n",imc);
                        System.out.println("Você se encontrar com Obesidade Grau I !");
                    } else if (imc <= 39.9) {
                        System.out.printf("Seu IMC e: %.2f\n",imc);
                        System.out.println("Você se encontrar com Obesidade Grau II !");
                    } else if (imc >= 40.0) {
                        System.out.printf("Seu IMC e: %.2f\n",imc);
                        System.out.println("Você se encontrar com Obesidade Grau III !");
                    }
                    break;
                case 2:
                    System.out.println("Informe o ano:");
                    int ano =  sc.nextInt();
                    double test1 = ano % 4;
                    double test2 = ano % 100;
                    double test3 = ano % 400;

                    if((test1 == 0 && test2 != 0) || (test3 == 0)){
                        System.out.println("Ano Bissexto.");
                    } else {
                        System.out.println("Ano nao foi Bissexto.");
                    }
                    break;
                case 3:
                    System.out.println("Qual tipo de Escalas Termométricas: deseja converter? Digite-F para Fahrenheit ou Digite-C para Celsius:");
                    char termometricas = sc.next().charAt(0);

                    if (termometricas == 'F' || termometricas == 'f'){
                        System.out.println("Informe a temperatura em Fahrenheit: ");
                        temperatura = sc.nextDouble();
                        double c =  (temperatura - 32) / 1.8;
                        System.out.printf("A temperatura Fahrenheit para Celsius e de: %.2f", c);
                    } else if (termometricas == 'C' || termometricas == 'c') {
                        System.out.println("Informe a temperatura em Celsius: ");
                        temperatura = sc.nextDouble();
                        double f = temperatura * 1.8 + 32;
                        System.out.printf("A temperatura Celsius para Fahrenheit e de: %.2f", f);
                    } else {
                        System.out.println("Digite F ou C , F para Fahrenheit ou C para Celsius");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite um número entre 1 a 4!");
            }

        } while (opcao != 4);



    }
}
