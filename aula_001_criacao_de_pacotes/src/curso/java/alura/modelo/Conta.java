package curso.java.alura.modelo;

import curso.java.alura.excecoes.SaldoInsuficienteException;
import curso.java.alura.excecoes.ValorNegativoException;

public abstract class Conta {
    /*
     * private: disponível somente dentro da classe;
     * protected: disponível apenas para filhos (herança);
     * sem modificador de acesso (package private): disponível somente no pacote;
     * public: disponível para todos.
     */

    protected double saldo;
    private int agencia;
    private int numero;

    private static int total;

    /**
     * Construtor para inicializar o objeto Conta
     *
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Agencia " + this.agencia + " de numero " + this.numero + " criada.");
        Conta.total++;  // atributo da classe e nao somente da instancia
    }

    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Valor não pode ser menor ou igual a zero.
     * @param valor
     * @throws ValorNegativoException
     */
    public abstract void deposita(double valor) throws ValorNegativoException;

    public void saca(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Saldo: R$" + this.saldo + ". Valor de Saque: R$" + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor);
        try {
            destino.deposita(1000);
        } catch (ValorNegativoException ex) {
            System.out.println("Não é possível depositar valores iguais ou menores que 0!");
        }
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não é permitido valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não é permitido valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }


    public static int getTotal() {
        return Conta.total;
    }
}
