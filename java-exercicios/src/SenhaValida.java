import java.util.Scanner;

public class SenhaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        System.out.println("Digite a senha de acesso:");
        senha = sc.nextInt();

        while(senha != 2002){
            System.out.println("Senha Invalida!.Digite a senha novamente:");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
    }
}
