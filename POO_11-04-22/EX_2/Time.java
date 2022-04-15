import java.util.Scanner;
public class Time {
    String nome;
    private int pontos;

        public int getPontos(){
            return this.pontos;
        }
        public void setPontos(int pontos){
            this.pontos = pontos;
        }
        
        static void recurso(String n1, int p1,String n2, int p2){
            System.out.println("\n\n\n\n----------------------------------------------");
            System.out.println("\t    Placar final");
            System.out.println("----------------------------------------------");
            System.out.println("\t"+n1+" "+p1+" x "+p2+" "+n2);
            System.out.println("----------------------------------------------");
        }

        static void jogar(String n_time1, int p_time1, String n_time2, int p_time2){
            Scanner input = new Scanner(System.in);
            int op;
            while(p_time1<3 && p_time2<3){
                System.out.println("\n\nQuem marcou o gol ? \n 1_"+n_time1+"\t2_"+n_time2);
                op = input.nextInt();
                
                    if(op==1){
                        p_time1 +=1;
                    }else{
                        p_time2 +=1;
                    }
                    System.out.println("----------------------------------------------");
                    System.out.println("\t"+n_time1+" "+p_time1+" x "+p_time2+" "+n_time2);
                    System.out.println("----------------------------------------------");
            }
            recurso(n_time1,p_time1,n_time2,p_time2);
            input.close();
        }
    public static void main(String[] args){
            Time t1, t2;
            t1 = new Time();
            t1.nome = "Cruzero";
            t1.pontos = 0;
            
            t2 = new Time();
            t2.nome = "Atletico";
            t2.pontos = 0;
            jogar(t1.nome,t1.pontos, t2.nome, t2.pontos);
    }
}