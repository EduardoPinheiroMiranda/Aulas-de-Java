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
        Emprestimo emp = new Emprestimo();
        Pessoa pes = new Pessoa();

        System.out.println("-----Resumo do emprestimo-----");
        System.out.println("Nome do livro: "+nomeLivro);
        System.out.println("Código do Livro: "+codLivro);
        System.out.println("Nome do leitor: "+pes.nome);
        System.out.println("Idade do leitor: "+pes.idade);
        System.out.println("Data de retirada: "+ emp.data);
        System.out.println("Previsão de devolução: "+ emp.previsaoEntrega);
        System.out.println("Local do emprestimo: "+emp.biblioteca);


    input.close();
    }

}