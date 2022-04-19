package Atividade_01;

public class DATA{
    private int mes;
    private int dia;
    private int ano;
    
        public int getMes() {
            return this.mes;
        }
        public void setMes(int mes) {
            this.mes = mes;
        }
        public int getDia() {
            return this.dia;
        }
        public void setDia(int dia) {
            this.dia = dia;
        }
        public int getAno() {
            return this.ano;
        }
        public void setAno(int ano) {
            this.ano = ano;
        }

        void Displaydata(){
            System.out.println(dia+" / "+mes+" / "+ano);
        } 

}