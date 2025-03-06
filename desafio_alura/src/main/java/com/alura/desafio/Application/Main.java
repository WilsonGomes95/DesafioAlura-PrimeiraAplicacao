package com.alura.desafio.Application;
import java.util.Scanner;
import com.alura.desafio.entities.Conta;
import com.alura.desafio.entities.Pessoa;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Wilson", 29);
        Conta conta = new Conta(pessoa);
        System.out.println("********** Desafio Alura **********");
        System.out.println(String.format("""
                Dados iniciais do cliente:
                Nome: %s
                Numero da conta: %s
                Tipo de conta: %s
                Saldo inicial: %.2f
                """, pessoa.getName(), conta.getConta(), conta.getTipoConta(), conta.getSaldo()));
        int opcao;
        do{
            System.out.println("********** Desafio Alura **********");
            System.out.println("Operações:");
            System.out.print(String.format("""
                    01 - Consultar Saldos
                    02 - Receber Valor
                    03 - Transferir Valor
                    04 - Sair

                    Digite a opção desejada:"""));
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + conta.getSaldo() + "\n");
                    break;
                case 2:
                    System.out.print("Informe o valor a ser depositado: ");
                    double valor = scan.nextDouble();
                    conta.deposito(valor);
                    System.out.println("O saldo atual é R$ " + conta.getSaldo());
                    break;
                case 3:
                    System.out.print("Informe o valor a ser transferido: ");
                    double valorTransferencia = scan.nextDouble();
                    if(valorTransferencia <= conta.getSaldo()){
                        System.out.println("Transferencia realizada com sucesso!");
                        conta.saque(valorTransferencia);
                        System.out.println("O saldo atual é R$ " + conta.getSaldo());
                    }
                    else{
                        System.out.println("Saldo insuficiente para realizar a transferência!");
                        System.out.println("O saldo atual é R$ " + conta.getSaldo());
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
            

            
            
            }
        } while (opcao != 4);
        scan.close(); // Add a condition to exit the loop as needed
    }
        
}