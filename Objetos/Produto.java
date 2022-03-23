import java.util.Scanner;
public class Produto{
    String nome;
    double peso,preco,quantidade;

    void informacao(){
        if(peso*quantidade<=10){
                System.out.println("*********************************************");
                System.out.println("**** O Produto "+nome+" foi vendido.\n****");
                System.out.println("**** Produto: "+nome);
                    if(nome=="Picanha"){
                        System.out.println("**** Peso: "+quantidade);
                    }else{
                        System.out.println("**** Peso: "+peso);
                    }
                System.out.print  ("**** Valor: "+preco*quantidade);
                System.out.println("\n*********************************************");
        }else{
            System.out.println("O produto exedeu os 10kg, tente novamente!!");
        }  
    }
    
    static void totalCompra(double mat[][],double desc){
        desc = mat[1][2]-(mat[1][2]*(desc/100));
        if(mat[0][0]*mat[0][1]<=10 && mat[1][0]*mat[1][1]<=10){
            System.out.println("****");
            System.out.println("**** TOTAL ---->  "+(mat[0][2]+desc));
            System.out.println("****");
            System.out.println("*********************************************\n\n\n");
        }
    }


    public static void main(String[] args){
        double desc;
        double compfinal[][];
        compfinal = new double[2][3];
        Scanner input = new Scanner(System.in);

        Produto p1, p2;
        p1 = new Produto();
        p1.nome = "Arroz Prato Fino";
        p1.preco = 9.5;
        System.out.println("Qual a quantidade de "+ p1.nome+" ?");
        p1.quantidade = input.nextDouble();
        p1.peso = 10;

        p2 = new Produto();
        p2.nome = "Picanha";
        System.out.println("Qual o peso da Picanha ?");
        p2.quantidade = input.nextDouble();
        p2.peso = 1;
        p2.preco = 23;
        System.out.println("Qual o desconto da Picanha ?");
        desc = input.nextDouble();
        input.close();
        

        compfinal[0][0]=p1.peso;
        compfinal[0][1]=p1.quantidade;
        compfinal[0][2]=p1.preco * p1.quantidade;
        compfinal[1][0]=p2.peso;
        compfinal[1][1]=p2.quantidade;
        compfinal[1][2]=p2.preco * p2.quantidade;

        System.out.println("\n\n\n\n");

        p1.informacao();
        p2.informacao();
        totalCompra(compfinal,desc);
    }
}