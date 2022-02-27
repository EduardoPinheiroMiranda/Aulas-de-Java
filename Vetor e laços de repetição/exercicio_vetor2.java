import java.util.Scanner;
public class exercicio_vetor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x;
        int vet[];
        vet = new int[20];
        for(int i=0; i<20; i++){
            vet[i] = i+1;
        }
        System.out.println("Digite um número inteiro...");
        x = input.nextInt();
        input.close();

            for(int i=0; i<20; i++){
                System.out.println(vet[i]*x);
            }

    }
}
