import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o numero da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
        "Sua agência é: " + agencia + ", conta: " + numero + 
        " e seu saldo: R$ " + String.format("%.2f", saldo) + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}