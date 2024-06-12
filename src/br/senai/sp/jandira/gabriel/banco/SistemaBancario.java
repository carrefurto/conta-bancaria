package br.senai.sp.jandira.gabriel.banco;

import br.senai.sp.jandira.gabriel.banco.domain.Agencia;
import br.senai.sp.jandira.gabriel.banco.domain.Cliente;
import br.senai.sp.jandira.gabriel.banco.domain.Conta;
import br.senai.sp.jandira.gabriel.banco.domain.TipoConta;

import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
        Scanner valorSaque = new Scanner(System.in);
        Scanner valorDeposito = new Scanner(System.in);

        Cliente cliente01 = new Cliente();
        Cliente cliente02 = new Cliente();

        cliente01.setNome("salamandra");
        cliente01.setTelefone("(11) 78247-1941");
        cliente01.setCpf("123.423.512-41");

        Agencia agencia01 = new Agencia();
        agencia01.setNumero("123-4");
        agencia01.setEndereco("rua aquela lá, 421 - Paraisópolis/SP");
        agencia01.setGerente("Fumaça (gato)");

        Conta conta01 = new Conta();
        conta01.setCliente(cliente01);
        conta01.setAgencia(agencia01);
        conta01.setNumero("1843-19");
        conta01.depositar(100);
        conta01.setTipoConta(TipoConta.CORRENTE);

        // Fazer o depósito
        conta01.depositar(valorDeposito.nextInt());
        System.out.println(conta01.getSaldo());

        // Sacar valor desejado
        conta01.sacar(valorSaque.nextInt());
        System.out.println(conta01.getSaldo());

        cliente02.setNome("lagartixa");
        cliente02.setTelefone("(11) 82946-1233");
        cliente02.setCpf("627.732.182-92");

        Conta conta02 = new Conta();
        conta02.setCliente(cliente02);
        conta02.setAgencia(agencia01);
        conta02.setNumero("2903-21");
        conta02.depositar(100);
        conta02.setTipoConta(TipoConta.POUPANCA);





    }
}
