public class tempo{
    int hora, min, seg;

    int Tempo(int Hora){
        System.out.println("---------------------------------------------------------");
        System.out.println("São "+Hora+" horas");
        return 0;
    }
    int Tempohm(int Hora, int min){
        System.out.println("\nSão "+Hora+":"+min);
        return 0;
    }
    int Tempohms(int Hora, int min,int sec){
        System.out.println("\nSão "+Hora+":"+min+":"+sec);
        System.out.println("---------------------------------------------------------");
        return 0;
    }
    int ConverterHoraParaSeg(int hora){
        System.out.println("São "+hora+" horas, o que equivale a "+hora*3600+" segundos");
        System.out.println("---------------------------------------------------------");
        return 0;
    }
    int ConverterMinutosparaSeg(int min){
        System.out.println("São "+min+" minutos, equivalente a "+ min*60+" segundos");
        System.out.println("---------------------------------------------------------");
        return 0;
    }
    int SomarTempoEmSeg(int hora, int min, int sec){
        int soma;
        soma = ((hora*60)*60 + (min*60) + sec);
        System.out.println("A soma do tempo é "+ soma+" segundos");
        System.out.println("---------------------------------------------------------");
        return 0;
    }
    int ImprimirTempoEmSeg(int hora,int min, int sec){
        System.out.println(hora*60*60+" : "+min*60+" : "+sec);
        System.out.println("---------------------------------------------------------");
        return 0;
    } 

    public static void main(String[] args){
        tempo h;
        h = new tempo();
        h.hora = 4;
        h.min = 50; 
        h.seg = 35;
        h.Tempo(h.hora);
        h.Tempohm(h.hora, h.min);
        h.Tempohms(h.hora, h.min, h.seg);
        h.ConverterHoraParaSeg(h.hora);
        h.ConverterMinutosparaSeg(h.min);
        h.SomarTempoEmSeg(h.hora, h.min, h.seg);
        h.ImprimirTempoEmSeg(h.hora,h.min,h.seg);

    }
}