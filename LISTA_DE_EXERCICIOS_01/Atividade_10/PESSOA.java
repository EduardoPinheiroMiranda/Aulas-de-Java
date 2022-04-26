import java.util.Scanner;
public class PESSOA{
    private String [][] arvore = new String[3][10];
    
    public String[][] getArvore(){
        return this.arvore;
    }
    public void setArvore(String arvore[][]){
        this.arvore = arvore; 
    }

    public PESSOA(){
    Scanner input =new Scanner(System.in);
    int op;
        if(arvore[0][0]==null){
            preencher();
        }
        
        System.out.println("O que você quer fazer?\n1_Adicionar membro\t2_Mostrar Arvore");
        op = input.nextInt();
            
            switch(op){
                case 1:
                    Adicionar();
                break;
                case 2:
                    imprimir();
                break;
                default:
                    System.out.println("ERRO: valor inesperado");
            }
    input.close();
    }
    
    void preencher(){
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                arvore[i][j]="-";
            }
        }
    }
    void imprimir(){
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.print(arvore[i][j]+" ");
            }
            System.out.println("");
        }
        PESSOA pes = new PESSOA();
    }
    
    void Adicionar(){
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                if(arvore[i][0]=="-"){
                    System.out.println("Qual o nome da pessoa ?");
                    arvore[i][j] = input.next();
                    System.out.println("Qual a idade da pessoa ?");
                    arvore[i][j] = input.next();
                    System.out.println("Qual o nome da esposa(o) dessa pessoa ? Se não tiver coloque '-' ");
                    arvore[i][j] = input.next();
                    System.out.println("Qual o nome da mae dessa pessoa ? Se não tiver coloque '-' ");
                    arvore[i][j] = input.next();
                    System.out.println("Qual o nome do pai dessa pessoa ? Se não tiver coloque '-' ");
                    arvore[i][j] = input.next();
                    System.out.println("Qual o nome filho dessa pessoa ? Se não tiver coloque '-' ");
                    arvore[i][j] = input.next();
                }
                i=3; j=10;
                System.out.println("");
                PESSOA pes = new PESSOA();
            }
        }
        input.close();
    }
    
    public static void main(String[] args){
        PESSOA pes = new PESSOA();   
    }
}
