/*Constante -> Variavel em Java em que nao posso alterar o valor
 * usamos a palavra chave FINAL
 */



public class atividade3 {

    public static final int TAXA = 10;
    public static final double PI = 3.14;

    // public -> A constante pode ser acessad em qualquer parte do código.
    // static -> Essa constante é compartilhada entre todas as classes do meu programa.
    // final -> Não posso alterar o valor.

    public static void main(String[] args) {
        System.out.println("A taxa da loja é de:" +TAXA+"%");
        System.out.println("PI vale:" + PI);
    }
    
}
