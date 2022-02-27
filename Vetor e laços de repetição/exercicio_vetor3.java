import java.util.Scanner;
public class exercicio_vetor3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        float h,s=0;
        System.out.print("Quantos termos você quer calcular?");
        n = input.nextInt();
        input.close();
        for(int i=1;i<n;i++){
            h = i;
            s = s+1/h;
        }
        s +=1;
        System.out.print(s);
    }    
}
