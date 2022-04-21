import java.util.Scanner;
public class LampadaTresEstagios{
    void ApagarLampada(){
        System.out.println("--------------------\nLâmpada apagada, tudo no escuro\n--------------------\n");
    }
    void acenderLampadaParcial(){
        Scanner input = new Scanner(System.in);
        int ajuste = 0;

            System.out.println("Quantos porcentos vc que acender a lampada?\n0_Desligada   1 a 80_Meio acessa   +80_Acessa totalmente\ndigite um valor inteiro.");
            ajuste = input.nextInt();
            input.close();

        if(ajuste<80 && ajuste>0){
            System.out.println("\n--------------------\nLâmpada acesa parcialmente\n--------------------");
        }else if(ajuste>80){
            System.out.println("\n--------------------\nLampda acesa por completo\n--------------------");
        }else{
            System.out.println("\n--------------------\nLâmpada apagada\n--------------------");
        }
    }
    void AcenderLampadtotal(){
        System.out.println("\n--------------------\nLâmpda ligada no máximo\n--------------------");
    }
    public static void main(String[] args){
        LampadaTresEstagios lampada = new LampadaTresEstagios();
        lampada.ApagarLampada();
        lampada.acenderLampadaParcial();
        lampada.AcenderLampadtotal();
    }
}