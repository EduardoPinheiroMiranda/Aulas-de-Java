import java.util.Scanner;
public class Emprestimo{
    String data, previsaoEntrega;

    public Emprestimo(int op){
    Scanner input = new Scanner(System.in);
    int alt = 2;
        switch(op){
            case 1:
                    System.out.println("Data de retirada: "+ data);
                    System.out.println("Previsão de devolução: "+ previsaoEntrega);
            break;
            case 2:
                    System.out.println("\n");
                    System.out.println("Quando o Livro esta sendo retirado?");
                    data = input.next();
                    System.out.println("Previsão de entrega?");
                    previsaoEntrega = input.next();

                    Pessoa pes = new Pessoa(alt);
            break;
        }

    input.close();
    }

    public static void main(String[] args){
        int op = 2;
        Emprestimo emp = new Emprestimo(op);
    }

}