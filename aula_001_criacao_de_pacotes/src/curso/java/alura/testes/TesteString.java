package curso.java.alura.testes;

public class TesteString {
    public static void main(String[] args) {
        String nome = "wagner";
        // Strings são imutaveis. Nao é possivel alterar uma string sem que se crie uma nova.
        nome = nome.replace("w", "W");
        System.out.println(nome);

        System.out.println("O caracter na posicao 2 é: " + nome.charAt(2));

        System.out.println("Tudo maiusculo: " + nome.toUpperCase());
        System.out.println("Tudo minusculo: " + nome.toLowerCase());

        System.out.println("O indice da letra 'r' é: " + nome.indexOf('r'));
        System.out.println("O tamanho da string é: " + nome.length());

        System.out.println("Substring (a partir do indice): " + nome.substring(2));
        System.out.println("Substring (start, end-1): " + nome.substring(0, 3));  // 3 é exclusivo.

        String strigVazia = "";
        System.out.println("A string é vazia? " + strigVazia.isEmpty());
        System.out.println("A string é vazia? " + nome.isEmpty());

        String stringComEspacos = "    Wagner    ";
        System.out.println(stringComEspacos);
        System.out.println(stringComEspacos.trim());

        System.out.println(nome.contains("gn"));
    }
}
