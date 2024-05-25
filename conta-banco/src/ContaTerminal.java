import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    //Formatação de número decimal.
    private static final DecimalFormat decimal = new DecimalFormat("0.00");
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Criando uma condição para resolver a mensagem "Resource leak: 'scanner' is never closed".
        try{
            System.out.println("Digite o número da conta: ");
            int num = scanner.nextInt();

            //Esse scanner resolve o problema de pular o input para agencia. 
            scanner.nextLine();
    
            System.out.println("Digite sua agência: ");
            String agencia = scanner.nextLine();
    
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
    
            System.out.println("Digite seu saldo: ");
            double saldo = scanner.nextDouble();
    
            System.out.printf("Olá " +nome+ ", obrigado por criar sua conta, sua agência é " +agencia+ ", conta " +num+ " e seu saldo de R$" +decimal.format(saldo)+ " já está disponível para saque.");}

            finally{
                scanner.close();
            }
    }
}
