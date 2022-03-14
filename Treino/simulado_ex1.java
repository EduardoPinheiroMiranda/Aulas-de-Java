public class simulado_ex1 {
    public static void main(String[] args){
        String v1,v2;
        int x,y;
        int contx[], conty[];
        contx = new int[100];
        conty = new int[100];

            for(int i=0;i<100;i++){
                contx[i]=0;
                conty[i]=0;
            }
        v1 = args[0];
        v2 = args[1];

        x = Integer.parseInt(v1);
        y = Integer.parseInt(v2);

        if(x>y){
            for(int i=y;i<=x;i++){
                if(i%2==0){
                    for(int j=0;j<100;j++){
                        if(contx[j]==0){
                           contx[j]=i;
                            j=100; 
                        }
                    }
                }
                if(i%3==0){
                    for(int j=0;j<100;j++){
                        if(conty[j]==0){
                            conty[j]=i;
                            j=100;
                        }
                    }
                }
            }
        }else{
            for(int i=x;i<=y;i++){
                if(i%2==0){
                    for(int j=0;j<100;j++){
                        if(contx[j]==0){
                           contx[j]=i;
                            j=100; 
                        }
                    }
                }
                if(i%3==0){
                    for(int j=0;j<100;j++){
                        if(conty[j]==0){
                            conty[j]=i;
                            j=100;
                        }
                    }
                }
            }
        }
        System.out.print("Multiplos de 2: ");
        for(int i=0;i<100;i++){
           System.out.print((contx[i])+", "); 
        }

        System.out.print("Multiplos de 3: ");
        for(int i=0;i<100;i++){
           System.out.print((conty[i])+", "); 
        }
    }
}
