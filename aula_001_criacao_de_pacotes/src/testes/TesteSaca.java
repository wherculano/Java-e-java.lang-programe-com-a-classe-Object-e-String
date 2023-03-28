package testes;


import excecoes.ValorNegativoException;

public class TesteSaca {
    public static void main(String[] args) {
        modelo.ContaCorrente contaCorrente = new modelo.ContaCorrente(777, 999);
        try{
            contaCorrente.deposita(100);
        }catch(excecoes.ValorNegativoException ex){
            System.out.println("Não é possível depositar valores iguais ou menores que 0!");
        }
        contaCorrente.saca(200);
        System.out.println("Saldo: R$" + contaCorrente.getSaldo());

    }
}
