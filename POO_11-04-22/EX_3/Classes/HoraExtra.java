package Classes;

public class HoraExtra {
    private int horaExtra;

    public HoraExtra(){
        horaExtra = 10;
        mostrar();
    }

    public int getHoraExtra(){
        return this.horaExtra;
    } 
    public void sethoraExtra(int horaExtra){
        this.horaExtra = horaExtra;
    } 
    private void mostrar(){
        System.out.println("Horas extras adicionais acumuladas: "+horaExtra);
        System.out.println("\n");
    }
}
