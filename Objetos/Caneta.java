public class Caneta {
    String id,cor, canetaTamp;
    double tipoPonta;

    void ComSemTampa(){
        System.out.print(id+" está "+canetaTamp);
        System.out.print("\ncor: "+ cor);
        System.out.print("\ntipo de ponta: "+tipoPonta);
    }
    void tampar(){
        if(canetaTamp=="destampada"){
            System.out.println("\nA caneta foi tampada!");
            canetaTamp="tampada";
        }else{
            System.out.println("\nCaneta já está tampada!");
        }

    }
    void destampar(){
        if(canetaTamp=="tampada"){
            canetaTamp="destampada";
            System.out.println("\nA caneta foi destampada!");
        }else{
            System.out.println("\nCaneta já estava destampada!");
        }
    }
    void escreve(){
        if(canetaTamp=="destampada"){
            System.out.println("\nCaneta pronta para escrever!\n\n");
        }
    }


    public static void main(String[] args){
        Caneta can1,can2;
        can1 = new Caneta();
        can1.id = "Caneta 1";
        can1.cor = "Azul";
        can1.canetaTamp = "tampada";
        can1.tipoPonta = 0.7;

        can2 = new Caneta();
        can2.id = "Caneta 2";
        can2.cor = "vermelha";
        can2.canetaTamp = "destampada";
        can2.tipoPonta = 0.5;
        System.out.println("\n\n\n");

        can1.ComSemTampa();
        can1.tampar();
        can1.destampar();
        can1.escreve();

        can2.ComSemTampa();
        can2.tampar();
        can2.destampar();
        can2.escreve();
    }
    
}
