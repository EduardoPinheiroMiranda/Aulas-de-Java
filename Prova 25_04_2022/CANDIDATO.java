/*
Escreva o código de um programa que leia a pontuação de 200 candidatos de um concurso,
 com seus respectivos nomes e sexos. Ao término do programa, imprima, na tela, 
 os nomes e as pontuações apenas dos candidatos que obtiveram mais de 70 pontos. Em seguida, 
 imprima a média da pontuação das mulheres. 
 Todos os atributos da classe Candidato devem ser privados e possuir métodos acessores e modificadores públicos; 
Crie uma classe Principal que possuirá o método Main para testar o programa. *
*/
import java.util.Scanner;
public class CANDIDATO {
    //controle de candidatos
    int conti=200;                    //        <------
    // controle de candidatos
    private String [][] Candidatos = new String[200][2];
    private double [][] Cadnota = new double [200][1];
    
    public String[][] getCandidatos() {
        return this.Candidatos;
    }
    public void setCandidatos(String[][] candidatos) {
        this.Candidatos = candidatos;
    }
    public double[][] getCadnota() {
        return this.Cadnota;
    }
    public void setCadnota(double[][] cadnota) {
        this.Cadnota = cadnota;
    }

    public CANDIDATO(){
        AdicionarCand();
        Exibir70();
        MediaMulher();
    }

    void AdicionarCand(){
    Scanner input = new Scanner(System.in);
        for(int i=0; i<conti;i++){
            for(int j=0;j<2;j++){
                System.out.print("\nQual o nome do "+(i+1)+"° candidato ? ->");
                Candidatos[i][j] = input.next();
                System.out.print("Qual o seu sexo ? f ou m. ->");
                Candidatos[i][j+1] = input.next();
                System.out.print("Qual a nota do candidato ? ->");
                Cadnota[i][j] = input.nextDouble();
                    j=2;
            }
        }
    input.close();
    }

    void Exibir70(){
        System.out.println("\n");
        System.out.println("Candidatos com notas acima de 70 pontos");
            for(int i=0; i<conti;i++){
                if(Cadnota[i][0]>70){
                    System.out.println(Candidatos[i][0]+": "+Candidatos[i][1]+": "+Cadnota[i][0]);
                }
            }
    }

    void MediaMulher(){
        double aux=0, media=0, soma=0;
        String f="f";

        for(int i=0;i<conti;i++){
            if(Candidatos[i][1].equals(f)){
                media += Cadnota[i][0];
                aux += 1;
            }
        }
        soma = media/aux;
        System.out.println("\nA média das candidatas femininas é de: "+soma);
    }

    

}
