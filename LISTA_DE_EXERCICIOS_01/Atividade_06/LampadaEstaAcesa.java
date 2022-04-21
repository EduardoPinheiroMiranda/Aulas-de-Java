import java.util.Scanner;
public class LampadaEstaAcesa {
    
    void estaAcesa(){
        Scanner input = new Scanner(System.in);
        int estado;
            System.out.println("A lampada está acesa?\n1_sim\t2_Não");
            estado = input.nextInt();
            input.close();

                if(estado==1){
                    System.out.println("Verdade");
                }else{
                    System.out.println("Falso");
                }
    }

    public static void main(String[] args){
        String res;
        LampadaEstaAcesa l = new LampadaEstaAcesa();
            l.estaAcesa();
    }
}
