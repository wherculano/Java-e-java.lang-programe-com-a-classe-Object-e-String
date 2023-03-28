package curso.java.alura.testes;

import curso.java.alura.excecoes.ValorNegativoException;
import curso.java.alura.modelo.ContaCorrente;

public class TestaDepositoNegativo {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(777, 9999);
        try {
            contaCorrente.deposita(-1000);
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
