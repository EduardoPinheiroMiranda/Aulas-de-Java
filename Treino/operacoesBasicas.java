public class operacoesBasicas {
    public static void main(String[] args){
        String ar1, ar2;
        ar1 = args[0];
        ar2 = args[1];

        int v1,v2;
        v1 = Integer.parseInt(ar1);
        v2 = Integer.parseInt(ar2);

        System.out.print("soma "+(v1)+"+"+(v2)+"="+(v1+v1));
        System.out.print("subtração "+(v1)+"+"+(v2)+"="+(v1-v1));
        System.out.print("multiplicação "+(v1)+"+"+(v2)+"="+(v1*v1));
        System.out.print("Divisão "+(v1)+"+"+(v2)+"="+(v1/v1));
        
    }
    
}
