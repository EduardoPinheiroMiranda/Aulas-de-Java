public class Produtos {
    String nomeProduto;
    double preco,quantidade;

    public Produtos(int quant,int pag){
        nomeProduto = "Notebook";
        preco = 5000;
        quantidade = 10;

            vendido(quant, pag);
           
    }
    
    void vendido(double quant, int pag){
        if(quantidade >0){
            switch(pag){
                case 1:
                    System.out.println("\n-------Compra realizada-------\nProduto: "+nomeProduto);
                    System.out.println("quantidade: "+quant);
                    System.out.println("valor da compra: "+(preco*quant));
                    System.out.println("formade pagamento: Dinheiro");
                    System.out.println("--------------------------------");
                break;
                case 2:
                    System.out.println("\n-------Compra realizada-------\nProduto: "+nomeProduto);
                    System.out.println("quantidade: "+quant);
                    System.out.println("valor da compra: "+(preco*quant));
                    System.out.println("formade pagamento: Cheque");
                    System.out.println("--------------------------------");
                break;
                case 3:
                    System.out.println("\n-------Compra realizada-------\nProduto: "+nomeProduto);
                    System.out.println("quantidade: "+quant);
                    System.out.println("valor da compra: "+(preco*quant));
                    System.out.println("formade pagamento: Cartão");
                    System.out.println("--------------------------------");
                break;

            }             
        }else{
            System.out.println("Estoque esgotado");
        }
    }
    
}
