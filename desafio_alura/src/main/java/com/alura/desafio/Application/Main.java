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
                Tipo de conta: %s
                Saldo inicial: %.2f
                """, pessoa.getName(), conta.getConta(), conta.getSaldo()));
        System.out.println("********** Desafio Alura **********");
        System.out.println("Operações:");
        System.out.println(String.format("""
                01 - Consultar Saldos
                02 - Receber Valor
                03 - Transferir Valor
                04 - Sair

                Digite a opção desejada:
                """));
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Saldo atual: " + conta.getSaldo());
                break;
            case 2:
                System.out.print("Informe o valor a ser depositado: ");
                double valor = scan.nextDouble();
                conta.deposito(valor);
                break;

            
        }


        scan.close();
    }
}