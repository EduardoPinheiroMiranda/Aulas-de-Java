import java.util.Scanner;
public class CONTATOS{
    private int conti=3;
    private String  [][] AgendaFamilia = new String [3][2];
    private String  [][] AgendaTrabalho = new String [3][2];

    public String [][] getAgendaFamalia(){
        return this.AgendaFamilia;
    }
    public void setAgendaFamilia(String [][] agendaFamilia){
        this.AgendaFamilia = agendaFamilia;
    }

    public String[][] getAgendaTrabalho(){
        return this.AgendaTrabalho;
    }
    public void setAgendaTrabalho(String[][] agendaTrabalho){
        this.AgendaTrabalho = agendaTrabalho;
    }
    public int getConti() {
        return this.conti;
    }
    public void setConti(int conti) {
        this.conti = conti;
    }



    public CONTATOS(int alt){
        switch(alt){
            case 1:
                ExibirAgenda();
            break;

            case 2:
                AdicionarContatos();
            break;
        }

    }

    void ExibirAgenda(){
    Scanner input = new Scanner(System.in);
        int op;
        
        
            System.out.println("\nEm qual agenda você adicionar o contato?\n1_Familia\t2_Trabalho");
            op = input.nextInt();

            switch(op){
                case 1:
                        for(int i=0;i<conti;i++){
                            if(AgendaFamilia[i][0]!=null || AgendaFamilia[i][1]!=null){
                                System.out.println(AgendaFamilia[i][0]+": "+AgendaFamilia[i][1]);
                                AGENDA age = new AGENDA();
                            }
                        }  
                break;
                case 2:
                        for(int i=0;i<conti;i++){
                            if(AgendaFamilia[i][0]!=null || AgendaFamilia[i][1]!=null){
                                System.out.println(AgendaFamilia[i][0]+": "+AgendaFamilia[i][1]);
                                AGENDA age = new AGENDA();
                            }
                        } 
                break;
            }
    input.close();
    }


    void AdicionarContatos(){
    Scanner input = new Scanner(System.in);
    int op;
    
        System.out.println("\nQual agenda você vai adicionar o contato ?\n1_Familia\t2_Trabalho");
        op = input.nextInt();

        switch(op){
            case 1:
                    for(int i=0;i<conti;i++){
                            if(AgendaFamilia[i][0] == null && AgendaFamilia[i][1] == null){
                                System.out.print("Qua o nome do contato ?");
                                AgendaFamilia[i][0] = input.next();
                                System.out.print("Qua o número do contato ?");
                                AgendaFamilia[i][1] = input.next();
                                System.out.print("\n");
                                i=conti;
                                AGENDA age = new AGENDA();
                            }
                    }
            break;

            case 2:
                    for(int i=0;i<conti;i++){
                            if(AgendaTrabalho[i][0] == null && AgendaTrabalho[i][1] == null){
                                System.out.print("Qua o nome do contato ?");
                                AgendaTrabalho[i][0] = input.next();
                                System.out.print("Qua o número do contato ?");
                                AgendaTrabalho[i][1] = input.next();
                                System.out.print("\n");
                                i=conti;
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