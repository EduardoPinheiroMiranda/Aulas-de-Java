package Atividade_02;

public class EMPREGADOS {
    private String PrimeiroNome;
    private String Sobrenome;
    private double SalarioMensal;
    
        public String getPrimeiroNome() {
            return this.PrimeiroNome;
        }
        public void setPrimeiroNome(String primeiroNome) {
            this.PrimeiroNome = primeiroNome;
        }
        public String getSobrenome() {
            return this.Sobrenome;
        }
        public void setSobrenome(String sobrenome) {
            this.Sobrenome = sobrenome;
        }
        public double getSalarioMensal() {
            return this.SalarioMensal;
        }
        public void setSalarioMensal(double salarioMensal) {
            if(salarioMensal<0){
                this.SalarioMensal = 0.00;
            }else{
                this.SalarioMensal = salarioMensal;
            } 
        }

            void mostrarDados(){
                System.out.println(" ");
                System.out.println("Empregado(a): "+PrimeiroNome+" "+Sobrenome);
                System.out.println("Salario anual:"+ (SalarioMensal*12));
                System.out.println("Salario com aumento: "+((SalarioMensal+(SalarioMensal*0.10))*12));
            }

}
