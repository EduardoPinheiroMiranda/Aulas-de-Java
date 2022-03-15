import java.util.Scanner;
public class simulado_ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double n,  soma = 0;
        
        System.out.println("Digite um numero inteiro positivo.");
        n = input.nextInt();
        input.close();

        soma = (1/n);
        int i;
        for(i=1;i<n;i++){
            if(i%2!=0){
                soma-= 1/(n-i);
            }else{
                soma+= 1/(n-i);
            }
        }
        if(i==n){
            if(i%2==0){
                soma += 1;
            }else{ 
                soma -= 1;
            }
        }


        System.out.println("\nO valor de soma é "+ (soma));
    }
}
