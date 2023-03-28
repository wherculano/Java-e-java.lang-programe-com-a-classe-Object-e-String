package curso.java.alura.modelo;

import curso.java.alura.excecoes.ValorNegativoException;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) {
        double valorComTaxa = valor + 0.10;
        super.saca(valorComTaxa);
    }

    @Override
    public void deposita(double valor) throws ValorNegativoException {
        if (valor <= 0) {
            throw new ValorNegativoException("Não é possível depositar valor menor ou igual a 0");
        }
        this.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString(){
        return "ContaCorrente: " + super.toString();
    }
}
