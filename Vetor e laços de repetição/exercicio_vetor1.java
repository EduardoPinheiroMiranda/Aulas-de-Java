import java.util.Scanner;
public class exercicio_vetor1 {
    public static void main(String[]argns){
        Scanner input = new Scanner(System.in);
        int notaProva;
        int notaTrabalho, soma;

            System.out.print("Qual foi o valor do seu trabalho ?");
            notaTrabalho =input.nextInt();
            System.out.print("Qual o valor da sua prova?");
            notaProva = input.nextInt();
            input.close();
                soma = notaProva + notaTrabalho;

                if(soma>=85){
                    System.out.print("sua nota foi "+soma+" conceito: A");
                }else if(soma>=70 && soma<=84){
                    System.out.print("Sua nota foi "+soma+" Conceito: B");
                }else if(soma>=60 && soma<=69){
                    System.out.print("Sua nota foi "+soma+" conceito: C");
                }else if(soma>=0 && soma<=59){
                    System.out.print("Sua nota foi "+soma+" conceito: D");
                }
    }
}
