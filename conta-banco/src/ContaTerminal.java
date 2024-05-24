import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int num = scanner.nextInt();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá, " +nome+ " obrigado por criar sua conta, sua agência é " +agencia+ ", conta" + num + "e seu saldo é R$" +saldo+ " já está disponível para saque.");
    }
}
