import java.util.Scanner;
public class AGENDA {


    public AGENDA(){
        Scanner input =new Scanner(System.in);
        int op=1;

            do{
                System.out.println("Bem vindo a sua agenda!! O que você deseja ?");
                System.out.println("1_Consultar Agenda\n2_Adicionar contato a agenda\n3_exit");
                    op = input.nextInt();
                        if(op==1){
                            CONTATOS  cont =new CONTATOS(op);
                        }else if(op==2){
                            CONTATOS  cont =new CONTATOS(op);
                        }else{
                            System.out.println("Encerrando programa");
                        }
            }while(op<2);
            
            
        input.close();
    }


    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
        int op=1;

            do{
                System.out.println("Bem vindo a sua agenda!! O que você deseja ?");
                System.out.println("1_Consultar Agenda\n2_Adicionar contato a agenda\n3_exit");
                    op = input.nextInt();
                        if(op==1){
                            CONTATOS  cont =new CONTATOS(op);
                        }else if(op==2){
                            CONTATOS  cont =new CONTATOS(op);
                        }else{
                            System.out.println("Encerrando programa");
                        }
            }while(op<2);
            
            
    input.close();
    }
}
