package Atividade_01;
public class mainDATA {

    public static void main(String[] args) {
        DATA data,data1;
        data = new DATA();
        data.setDia(12);
        data.setMes(04);
        data.setAno(2001);

        data1 = new DATA();
        data1.setDia(31);
        data1.setMes(07);
        data1.setAno(2003);

        data.Displaydata();
        data1.Displaydata();

    }
    
}
