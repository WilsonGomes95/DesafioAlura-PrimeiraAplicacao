package com.alura.desafio.entities;

import java.util.Random;

public class Conta {

    private int conta = new Random().nextInt(100000);
    private double saldo = 0;
    private Pessoa titular;
    private String tipoConta = "Corrente";

    public Conta(){
    }

    public Conta(Pessoa titular) {
        this.titular = titular;
        
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }
    
    





}
