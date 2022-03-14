import java.util.Scanner;

public class modulos{
    public static int pares(double[] vetor, int n){
        int par=0;
        for(int i=0;i<n;i++){
            if(vetor[i]%2==0){
                par+=1;
            }
        }
        return par;
    }
    public static void mian(String[] args){
        Scanner input = new Scanner(System.in);
        int x, res;
        double vet[];
        vet = new double[100000000];

        System.out.println("Digite um número qualquer");
            x = input.nextInt();
        input.close();
            int aux=0;
            for(int i=x; x<=0;i--){
                vet[aux]=i;
                aux+=1;
            }

        res = pares(vet,x);
        System.out.println("O vetor possui "+ (res)+" de números pares");
    }
}