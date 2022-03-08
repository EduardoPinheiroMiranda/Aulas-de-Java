public class Argumentos{
    public static void main(String[] args){
        String arg1, arg2;
        arg1 = args[0];
        arg2 = args[1];

        int valor1 = Integer.parseInt(arg1);
        int valor2 = Integer.parseInt(arg2);
        int n;
        n = valor1+valor2;
        System.out.println("soma:" + n);
    }
}