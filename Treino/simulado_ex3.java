import java.util.Scanner;
public class simulado_ex3 {
    public static double func(double x){
        double res=0;
        res=(3*(x*x*x)) + (2*(x*x)) + x + 1;

        return res;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x, res = 0;

        System.out.println("Digite um numero");
        x = input.nextDouble();
        input.close();
        res = func(x);

            System.out.println("O resultado é " + (res));

    }
}
