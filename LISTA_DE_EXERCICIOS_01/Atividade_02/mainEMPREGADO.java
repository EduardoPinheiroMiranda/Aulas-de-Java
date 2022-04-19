package Atividade_02;

public class mainEMPREGADO {
    public static void main(String[] args) {
        EMPREGADOS empregados, empregados2;
        empregados = new EMPREGADOS();
        empregados.setPrimeiroNome("Eduardo");
        empregados.setSobrenome("Pinheiro Miranda");
        empregados.setSalarioMensal(2000);

        empregados2 = new EMPREGADOS();
        empregados2.setPrimeiroNome("Ricardo");
        empregados2.setSobrenome("Pinheiro Miranda");
        empregados2.setSalarioMensal(800);

        empregados.mostrarDados();
        empregados2.mostrarDados();
        
    }
}
