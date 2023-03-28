package curso.java.alura.testes;

import curso.java.alura.excecoes.ValorNegativoException;
import curso.java.alura.modelo.ContaCorrente;

public class TesteSaca {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(777, 999);
        try {
            contaCorrente.deposita(100);
        } catch (ValorNegativoException ex) {
            System.out.println("Não é possível depositar valores iguais ou menores que 0!");
        }
        contaCorrente.saca(200);
        System.out.println("Saldo: R$" + contaCorrente.getSaldo());

    }
}
