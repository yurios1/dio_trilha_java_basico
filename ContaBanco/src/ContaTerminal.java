import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a class Scanner;

        //Exibir as mensagens para o usuário;

        //Obter pela Scanner os valores digitados no terminal;

        //Exibir a mensagem conta criada;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Numero da Conta: ");
        int numberAC = scanner.nextInt();

        System.out.println("Agencia: ");
        String numberAgency = scanner.next();

        scanner.nextLine();

        System.out.println("Nome do Cliente: ");
        String nameClient = scanner.nextLine();

        System.out.println("Saldo: ");
        double currency = scanner.nextDouble();

        System.out.println("Cliente cadastrado com Sucesso.");
        System.out.println("Cliente: " + nameClient);
        System.out.println("Conta:" + numberAgency + " " + numberAC);
        System.out.println("Saldo: " + currency);


        System.out.println("Olá " + nameClient + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + numberAgency + ", conta " + numberAC + ", e seu saldo " + currency + ", já está disponìvel para saque.".formatted(nameClient, numberAgency, numberAC, currency));


    }

}
