
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

    public static void main(String[] args) {
        DATA data,data1;
        data = new DATA();
        data.dia = 12;
        data.mes = 04;
        data.ano = 2001;

        data1 = new DATA();
        data1.dia = 31;
        data1.mes = 07;
        data1.ano = 2003;

        data.Displaydata();
        data1.Displaydata();

    }
}