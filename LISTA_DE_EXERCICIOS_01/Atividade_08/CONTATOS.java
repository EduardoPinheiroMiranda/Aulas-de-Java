import java.util.Scanner;
public class CONTATOS{
    String  [][] agendaFamilia = new String [3][2];
    String  [][] agendaTrabalho = new String [3][2];
    int conti=3, contj=2; 
    public CONTATOS(int alt){
        if(agendaFamilia[0][0] == null && agendaTrabalho[0][0] == null){
            CriarMatriz();
        }
        
        switch(alt){
            case 1:
                ExibirAgenda();
            break;

            case 2:
                AdicionarContatos();
            break;
        }

    }

    void CriarMatriz(){
        for(int i=0;i<conti;i++){
            for(int j=0;j<contj;j++){
                agendaFamilia[i][j] = "-";
                agendaTrabalho[i][j] = "-";
            }
        }
    }

    void ExibirAgenda(){
    Scanner input = new Scanner(System.in);
    int op;

        System.out.println("\nQual Agenda deve ser exibida ?\n1_Famailia\t2_Trabalho");
        op = input.nextInt();
        input.close();

            switch(op){
                case 1:
                    for(int i=0;i<conti;i++){
                        for(int j=0;j<contj;j++){
                            System.out.println(this.agendaFamilia[i][j]+": "+ this.agendaFamilia[i][j+1]);
                            j=contj;
                        }
                    }
                break;
                case 2:
                    for(int i=0;i<conti;i++){
                        for(int j=0;j<contj;j++){
                            System.out.println(this.agendaTrabalho[i][j]+": "+ this.agendaTrabalho[i][j+1]);
                            j=contj;
                        }
                    }
                break;
                default:
                System.out.println("ERRO, valor inesperado");
            }
    }

    void AdicionarContatos(){
    Scanner input = new Scanner(System.in);
    int op;
    
        System.out.println("\nQual agenda você vai adicionar o contato ?\n1_Familia\t2_Trabalho");
        op = input.nextInt();

            switch(op){
                case 1:
                        for(int i=0;i<conti;i++){
                            for(int j=0;j<contj;j++){
                                if(agendaFamilia[i][j] == "-" && agendaFamilia[i][j] == "-"){
                                    System.out.print("Qua o nome do contato ?");
                                    agendaFamilia[i][j] = input.next();
                                    System.out.print("Qua o número do contato ?");
                                    agendaFamilia[i][j+1] = input.next();
                                    System.out.print("\n");
                                }
                                i=conti; j=contj;
                                AGENDA age = new AGENDA();
                            }
                        }
                        
                break;

                case 2:
                        for(int i=0;i<conti;i++){
                            for(int j=0;j<contj;j++){
                                if(agendaTrabalho[i][j] == "-" && agendaTrabalho[i][j+2] == "-"){
                                    System.out.print("Qua o nome do contato ?");
                                    agendaTrabalho[i][j] = input.next();
                                    System.out.print("Qua o número do contato ?");
                                    agendaTrabalho[i][j+1] = input.next();
                                    System.out.print("\n");
                                }
                                i=conti; j=contj;
                                AGENDA age = new AGENDA();
                            }
                        }
                break;

                default:
                    System.out.println("ERRO: valor diferente do esperado");
            }

    input.close();
    }

}