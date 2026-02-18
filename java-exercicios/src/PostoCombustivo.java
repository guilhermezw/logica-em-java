import java.util.Scanner;

public class PostoCombustivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;
        int opcao = 0;
        int acrescentador = 1;

        while (opcao != 4){
            System.out.println("\n");
            System.out.println("Menu: Posto Combustivo");
            System.out.println("1 | Alcool");
            System.out.println("2 | Gasolina");
            System.out.println("3 | Diesel");
            System.out.println("4 | Exit");
            System.out.println("Informe abaixo:");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    alcool += acrescentador;
                    System.out.println("Adicionado ao contador.");
                break;
                case 2:
                    gasolina += acrescentador;
                    System.out.println("Adicionado ao contador.");
                break;
                case 3:
                    diesel += acrescentador;
                    System.out.println("Adicionado ao contador.");
                break;
            }
        }

        System.out.print("\n");
        System.out.println("Quantidades de clientes que abastecerem nos ultimos dias:");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}
