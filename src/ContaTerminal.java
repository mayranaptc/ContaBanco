import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int conta = 0;
        String agencia = " ";
        String nomeClinte = " Mario Andrade ";
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta : (Exemplo:1023 - depois ENTER para o próximo campo.)");
        conta = scanner.nextInt();
        System.out.println(
                "Por favor, digite o número da Agência : (Exemplo:102-3 - depois ENTER para o próximo campo.)");
        agencia = scanner.next();

        System.out.println("Olá " + nomeClinte + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
