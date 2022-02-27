package Matrizes;

public class Matrizes_01 {
    public static void main(String[] args){
        String mat[][] = new String [5][5];
        int n=5;
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    mat[i][j]="*";
                }
            }

            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    System.out.print(mat[i][j]);
                }
                System.out.println();
            }

            System.out.println();
            for(int i=0;i<5;i++){
                for(int j=0;j<n;j++){
                    System.out.print(mat[i][j]);
                }
                n= n-1;
                System.out.println();
            }

            System.out.println();
            n=4;
            for(int i=0;i<5;i++){
                for(int j=0;j<5-n;j++){
                    System.out.print(mat[i][j]);
                }
                System.out.println();
                n=n-1;
            }
            
    }
    
}
