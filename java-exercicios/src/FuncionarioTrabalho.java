import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTrabalho {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Locale.setDefault(Locale.US);

        System.out.println("Digite numero do funcionario:");
        int numeroFuncionario = sc.nextInt();
        System.out.println("Digite numero de horas trabalhadas:");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor que recebe por hora:");
        double valorHora = sc.nextDouble();

        double salarioFinal = horasTrabalhadas * valorHora;

        System.out.println("Numero do funcionario: " + numeroFuncionario);
        System.out.printf("Salario do funcionario: %.2f\n", salarioFinal);

        sc.close();
    }
}
