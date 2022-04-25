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

    input.close();
    }

}