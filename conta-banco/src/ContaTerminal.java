import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);

        // Solicitar e obter número da conta
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        // Solicitar e obter número da agência
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        // Solicitar e obter nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitar e obter saldo da conta
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Mensagem final com os dados da conta
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
         
    }
}
