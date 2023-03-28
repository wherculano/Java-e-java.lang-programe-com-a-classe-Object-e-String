package testes;


public class TestaTributaveis {
    public static void main(String[] args) {


        modelo.ContaCorrente contaCorrente = new modelo.ContaCorrente(123, 321);
        try{
            contaCorrente.deposita(1000);
        }catch(excecoes.ValorNegativoException ex){
            System.out.println("Não é possível depositar valores iguais ou menores que 0!");
        }

        modelo.SeguroDeVida seguroDeVida = new modelo.SeguroDeVida();

        modelo.CalculadorImposto calculadorImposto = new modelo.CalculadorImposto();
        calculadorImposto.registra(contaCorrente);
        calculadorImposto.registra(seguroDeVida);

        System.out.println(calculadorImposto.getTotalImpostos());
    }
}
