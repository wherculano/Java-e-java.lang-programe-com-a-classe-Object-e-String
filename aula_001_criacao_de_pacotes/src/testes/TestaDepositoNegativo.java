package testes;

public class TestaDepositoNegativo{
    public static void main(String[] args) {
        modelo.ContaCorrente contaCorrente = new modelo.ContaCorrente(777, 9999);
        try{
            contaCorrente.deposita(-1000);
        }catch(excecoes.ValorNegativoException ex){
            System.out.println(ex.getMessage());
        }
    }
}
