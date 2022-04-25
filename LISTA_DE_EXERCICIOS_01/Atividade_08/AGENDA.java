import java.util.Scanner;
public class AGENDA {
    int alt;

    public AGENDA(){
        Scanner input =new Scanner(System.in);
        int Op;
            do{
                System.out.println("O que você deseja ?");
                System.out.println("1_Consultar Agenda\t2_Adicionar contato a agenda\t3_exit");
                    Op = input.nextInt();
                        if(Op==1){
                            CONTATOS cont = new CONTATOS(Op);
                        }else if(Op==2){
                            CONTATOS cont = new CONTATOS(Op);
                        }else{
                            System.out.println("Encerrando programa");
                        }
            }while(Op<2);
            
    input.close();
    }


    public static void main(String[] args) {
        System.out.println("\n\nBem vindo a sua agenda!! O que você deseja ?");
        AGENDA age = new AGENDA();
    }
}
