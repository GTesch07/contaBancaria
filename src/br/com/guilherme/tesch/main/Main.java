package br.com.guilherme.tesch.main;
import java.util.Scanner;

import br.com.guilherme.tesch.models.Conta;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static Conta conta = new Conta(1000);
    public static void main(String[]args){
        var option = -1;

        do{
            System.out.println("\n==== Bem vindo ao Banco DIO ====\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair\n");
            try{
                option = scanner.nextInt();
            }catch (java.util.InputMismatchException e){
                System.out.println("\nOpção inválida. Por favor, digite apenas números.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();
            switch(option){
                case 1 -> conta.consultarSaldo();
                case 2 -> conta.consultarChequeEspecial();
                case 3 -> {
                    System.out.println("Digite o valor a depositar: ");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);
                }
                case 4 -> {
                    System.out.println("Digite o valor a sacar: ");
                    double valor = scanner.nextDouble();
                    conta.sacar(valor);
                }
                case 5 -> {
                    System.out.println("Digite o valor do boleto: ");
                    double valor = scanner.nextDouble();
                    conta.pagarBoleto(valor);
                }
                case 6 -> conta.verificarUsoChequeEspecial();
                case 0 -> {
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while(true);


    }
}
