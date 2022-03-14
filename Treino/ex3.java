import java.util.Scanner;
public class ex3 {

    public static double soma(double[] vetor, int n){
        double sm=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(vetor[i]%2!=0){
                    sm -=  1/vetor[i]; 
                }
            }else{
                if(vetor[i]%2!=0){
                    sm +=  1/vetor[i]; 
                }
            }
            sm = 1-sm;
        }
        return sm;
    }
    public static void main(String[] args){
        double vetor[], res;
        vetor = new double [100];
        Scanner input = new Scanner(System.in);
        int num, aux;

        System.out.println("Digite um número impar");
        num = input.nextInt();
        input.close();

        for(int i=0;i<num;i++){
            aux = i;
            if(aux%2!=0){
                vetor[i-1]=aux;
                aux += 1;
            }else{ 
                i-=1;
                aux += 1;
            }
        }

        res = soma(vetor, num);
        System.out.println("A resposta é"+(res));
    }
    
}
