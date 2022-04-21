import java.util.Scanner;

public class Pedido {
    String itens;
    int quantidade;
    int pagamento;

    public Pedido(){
        comprar();
        Produtos ped = new Produtos(quantidade, pagamento);
        
    }
    void comprar(){
        Scanner input = new Scanner(System.in);
       
        System.out.println("Quantos produtos você quer?");
        quantidade = input.nextInt();
        System.out.println("Como quer pagar?\n1_dinheiro   2_Cheque   3_Cartão");
        pagamento = input.nextInt();
        input.close();

    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
    }
}
