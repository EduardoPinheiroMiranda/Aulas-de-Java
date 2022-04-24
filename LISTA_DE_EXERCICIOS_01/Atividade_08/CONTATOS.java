import java.util.Scanner;
public class CONTATOS {
    
    String agendaFamilia[][] ={ 
        {"-", "-"}, {"-", "-"},{"-", "-"},{"-", "-"},{"-", "-"},
        {"-", "-"}, {"-", "-"},{"-", "-"},{"-", "-"},{"-", "-"} 
    };
    public CONTATOS(int alt){
        switch(alt){
            case 1:
                exibirLista();
            break;
            
            case 2:
                AdicionarContato();
            break;
        }
    }

    void AdicionarContato(){
    Scanner input = new Scanner(System.in);
    int op;

        System.out.println("Onde você quer adicionar?");
        System.out.println("1_Familia\n2_Trabalho");
            op = input.nextInt();

                switch(op){
                    case 1:
                            for(int i=0;i<3;i++){
                                for(int j=0;j<2;j++){
                                    if(agendaFamilia[i][j] == "-" && agendaFamilia[i][j+1]=="-"){
                                        System.out.print("Qual o nome do contato(a) ?");
                                            agendaFamilia[i][j]=input.next();  
                                        System.out.print("Qual o numero dele(a) ?");
                                            agendaFamilia[i][j+1]=input.next();
                                    }
                                }
                            }
                    break;
                    
                    case 2: 
                            System.out.println("teste");
                    break;

                    default:
                        System.out.println("erro");
                }
    
    input.close();
    return ;
    }

    void exibirLista(){
        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                System.out.println(agendaFamilia[i][j] +" :"+agendaFamilia[i][j+1]);
                j=3;
            }
            System.out.println(" ");
        }
    }
}
