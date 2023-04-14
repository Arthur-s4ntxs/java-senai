// Tipos de variáveis em Java
/*
 * String -> Armazena texto
 * char -> Armazena uma única letra
 * int -> números inteiros
 * float -> números decimais menos precisao
 * double -> números decimais mais precisao
 */

 /*
  * Toda váriavel DEVE começar com letra minúscula
  * Não pode haver espaço no nome da variavel
  * nomeAluno, enderecoClinte, produtoAdquirido
  */


 public class exemplo{
    public static void main(String[] args) {

     
        String nome = "Arthur Oliva";
        int idade = 18;
        boolean chuva = true; // Em variáveis booleanas eu uso true ou false
        char letra = 'A'; // Todo char DEVE estar com aspas simples ''.
        double salario = 3550.49;
        float altura  = (float) 1.80; // Estou convertendo um double para float

        System.out.println(" meu nome é:" + nome);
        System.out.println(" minha idade é:" + idade);
        System.out.println("Está chovendo?"+ chuva);

        System.out.println(" A inicial do meu nome é:"+letra);
        System.out.println("Meu salário é:"+salario);
        System.out.println("Eu tenho:"+altura+"metros");

    }
    
 }
