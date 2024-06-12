package br.senai.sp.jandira.gabriel.banco.domain;

public class Conta {

    private Agencia agencia;
    private String numero;
    private double saldo;
    private Cliente cliente;
    private TipoConta tipoConta;

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void sacar(int valor) {
        if (valor <= saldo && valor > 0) {
            saldo = saldo - valor;
            System.out.println("SAQUE REALIZADO COM SUCESSO! ");
        } else {
            System.out.println("SALDO INSUFICIENTE! ");
            System.exit(0);
        }
    }

    public void depositar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("DEPOSITO CONCLUÍDO");
        } else {
            System.out.println("INSIRA UM VALOR VÁLIDO! ");
            System.exit(0);
        }
    }
}


