package Classes;
import java.util.Scanner;

public class Funcionario{
    int idade, tempoImpresa, domingos;
    private String nome, cargo;
    private double horasT[];
    
    public Funcionario(){
        horasT = new double[5];
        Scanner input = new Scanner(System.in);

            System.out.println("Qual o nome do funcionario ?");
            nome = input.next();
            System.out.println("Qual o cargo do funcionario ?");
            cargo = input.next();
            System.out.println("Quantos domingos foram trabalhados dentro do mês atual ?");
            domingos = input.nextInt();
            
                for(int i=0; i<domingos;i++){
                    System.out.print("Quantas horas foram trabalhadas no "+(i+1)+"° domingo? ");
                    horasT[i] = input.nextDouble();
                }

            input.close();
        mostrar();

        HoraExtra horaExt = new HoraExtra();

    }
    //Permitindo acesso ao atributo nome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    //permitindo acesso ao atributo cargo
    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    //permitindo acesso ao atributo horasT[]/*
    public double gethorasT(){
        return this.horasT[5];
    }
    public void setHorast(double horasT[]){
        this.horasT = horasT;
    }

    private void mostrar(){
        System.out.println("\"nO nome do funcionario é: "+nome);
        System.out.println("O seu cargo é: "+cargo);
        System.out.println("Horas trabalhadas ao domingos");
            for(int i=0;i<domingos;i++){
                System.out.println("\t"+(i+1)+"°: "+horasT[i]);
            }
    }

}
