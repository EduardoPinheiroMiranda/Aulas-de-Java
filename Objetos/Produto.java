public class Produto{
    String nome;
    double peso,preco;

    void informacao(){
        System.out.println("\nProduto:  "+nome);
        if(peso>10){
            System.out.println("Peso acima de 10kg, diminua a quantidade do produto");
        }else{
            System.out.println("Peso:  "+peso+" kg");
        }
        System.out.println("Preço: "+ preco+" /kg");
       
    }
    public static void main(String[] args){
        Produto p1;
        p1 = new Produto();
        p1.nome = "Arroz Prato Fino";
        p1.peso = 10;
        p1.preco = 9.5;

        p1.informacao();
    }
}