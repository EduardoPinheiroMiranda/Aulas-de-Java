import java.util.Scanner;
public class aula_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade;
        String nome;
        System.out.print("Qual o seu nome?\n");
        nome = input.nextLine();
        System.out.println("qual sua idade?\n");
        idade = input.nextInt();
        System.out.println("Seu nome é " + nome +" e sua idade é " + idade + " anos");
        input.close();
    }
}
