import java.util.Scanner;
public class Pessoa{
    String nome;
    int idade;

    public Pessoa(int alt){
            if(alt==1){
                System.out.println("Nome do leitor: "+nome);
                System.out.println("Idade do leitor: "+idade);
                int op = 1;
                Emprestimo emp = new Emprestimo(op);
            }else{
                Scanner input = new Scanner(System.in);
                    System.out.println("Qual o nome do leitor?");
                    nome = input.next();
                    System.out.println("Qual a idadeda pessoa?");
                    idade = input.nextInt();
                input.close();

                Livro li = new Livro();
            }
    }

}