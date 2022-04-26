import java.util.Scanner;
public class Livro{
    String nomeLivro;
    int codLivro;

    public Livro(){
    Scanner input = new Scanner(System.in);
        System.out.println("Qual o nome do livro?");
        nomeLivro = input.next();
        System.out.println("Qual o codigo do Livro");
        codLivro = input.nextInt();
        //////////////////////////////////

        System.out.println("-----Resumo do emprestimo-----");
        System.out.println("Nome do livro: "+nomeLivro);
        System.out.println("Código do Livro: "+codLivro);
        int alt = 1;
        Pessoa pes = new Pessoa(alt);


    input.close();
    }

    public static void main(String[] args) {
        Livro li = new Livro();
    }
}