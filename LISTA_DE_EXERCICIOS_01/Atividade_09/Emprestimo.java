import java.util.Scanner;
public class Emprestimo{
    String data, previsaoEntrega;
    String biblioteca;

    public Emprestimo(){
    Scanner input = new Scanner(System.in);
    System.out.println("\n");
        System.out.println("Quando o Livro esta sendo retirado?");
        data = input.next();
        System.out.println("Previsão de entrega?");
        previsaoEntrega = input.next();

        Pessoa pes = new Pessoa();

    input.close();
    }

    public static void main(String[] args){
        Emprestimo emp = new Emprestimo();
    }

}