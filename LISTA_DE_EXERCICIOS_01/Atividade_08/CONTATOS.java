import java.util.Scanner;
public class CONTATOS {
    
    String [][] AgendaFamilia = new String[10][2];
    
    public CONTATOS(int alt){
        switch(alt){
            case 1:
                System.out.println("teste");
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
                            for(int i=0;i<10;i++){
                                for(int j=0;j<2;j++){
                                    if(AgendaFamilia[i][j] == " "){
                                        System.out.print("Qual o nome do contato(a) ?");
                                            AgendaFamilia[i][j]=input.next();  
                                        System.out.print("Qual o numero dele(a) ?");
                                            AgendaFamilia[i][j+2]=input.next();
                                    }
                                }
                            }
                    break;
                    
                    case 2:
                            System.out.println("teste");
                    break;
                }


        
        
        
        
    input.close();
    }
}
