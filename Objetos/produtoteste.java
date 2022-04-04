public class produtoteste {
    String nome;
    float peso, preco;
    
    void status(){
        System.out.println("nome" + nome);
        System.out.println("peso" + peso);
        System.out.println("preco" + preco +"\n");
    }
    void vender(){
        System.out.println("o produto"+ nome + "foi vendido");
    }
    void pesar() {
        if(peso>10){
            System.out.println("erro. a balanca nao pesa valores acima de 10kg");
        }else{
            System.out.println("peso" + peso);
        }
    }
    void calcular() {
        double	precoo=preco*0.5;
            System.out.println("preco com desconto" + precoo);
    }
    
    public static void main(String[] args){
        produtoteste p1, p2;
        
        p1= new produtoteste();
        p1.nome="arroz prato fino";
        p1.peso=10f;
        p1.preco=9.50f;
        
        p2= new produtoteste();
        p2.nome= "picanha";
        p2.peso=1f;
        p2.preco=23f;
        
        System.out.println("\n\n");
        p1.status();
        p2.status();
        
    }
}
