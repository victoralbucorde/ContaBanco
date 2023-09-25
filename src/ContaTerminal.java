import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da agência.");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite a agência.");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Digite o saldo inicial da conta.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");
    }
}