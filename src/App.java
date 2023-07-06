import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nameClient = "João Lucas";
        String accountType = "Poupança";
        double valueInAccount = 2560.45;

        System.out.println("***********************\n");
        System.out.println("Nome do cliente: " + nameClient);
        System.out.println("Tipo de conta: " + accountType);
        System.out.println("Valor em conta: " + valueInAccount);
        System.out.println("\n***********************\n");

        String menu = """
                    Operações

                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair

                    Digite a opção desejada:
                """;
        
        Scanner scan = new Scanner(System.in);        
        int options = 0;
        double newValue;
        double transferValue;

        while (options != 4) {
            System.out.println(menu);
            options = scan.nextInt();

            if (options > 4) {
                break;
            }

            switch (options) {
                case 1:
                    System.out.println(valueInAccount);
                    break;
                case 2:
                    System.out.println("Acrescente um novo valor a sua conta\n");
                    newValue = scan.nextDouble();
                    valueInAccount = newValue + valueInAccount;
                    System.out.println("\nSeu novo valor é igual a: " + valueInAccount);
                    break;
                case 3:
                    System.out.println("Qual valor você gostaria de transferir?\n");
                    transferValue = scan.nextDouble();

                    if (transferValue > valueInAccount) {
                        System.out.println("Infelizmente você não pode transferir esse valor, lhe falta grana!!");
                        break;
                    }

                    valueInAccount = valueInAccount - transferValue;
                    System.out.println("\n Seu valor atual em conta é : " + valueInAccount);
                    break;
                default:
                    break;
            }
        }
    }
}
