package curso.java.alura.excecoes;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
