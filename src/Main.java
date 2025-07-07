import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static Conta conta = new Conta();
    public static void main(String[]args){
        var option = -1;

        do{
            System.out.println("==== Bem vindo ao Banco DIO ====\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            try{
                option = scanner.nextInt();
            }catch (java.util.InputMismatchException e){
                System.out.println("\nOpção inválida. Por favor, digite apenas números.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();
            switch(option){
                case 1 -> 
            }


        } while(true);


    }
}
