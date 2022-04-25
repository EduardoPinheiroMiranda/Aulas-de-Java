import java.util.Scanner;
public class Pessoa{
    String nome;
    int idade;

    public Pessoa(){
    Scanner input = new Scanner(System.in);
        System.out.println("Qual o nome do leitor?");
        nome = input.next();
        System.out.println("Qual a idadeda pessoa?");
        idade = input.nextInt();

        Livro liv = new Livro();

    input.close();
    }

}