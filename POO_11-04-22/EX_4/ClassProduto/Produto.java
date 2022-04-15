package ClassProduto;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public Produto(){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o nome do produto ?");
        nome = input.next();
        System.out.println("Qual o valor de custo ?");
        precoCusto = input.nextDouble();
        System.out.println("Qual o valor de fial do produto");
        precoVenda = input.nextDouble();
        input.close();
        erroValor();

        System.out.println(" ");
        calcularMargemlucro();
        getMargemLucroPorcentagem();
        System.out.println(" ");
    }
        //gets() and set()
        public String getNome() {
            return this.nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public double getPrecoCusto() {
            return this.precoCusto;
        }
        public void setPrecoCusto(double precocusto) {
            this.precoCusto = precocusto;
        }
        public double getPrecoVenda() {
            return this.precoVenda;
        }
        public void setPrecoVenda(double precoVenda) {
            this.precoVenda = precoVenda;
        }
        public double getMargemLucro() {
            return this.margemLucro;
        }
        public void setMargemLucro(double margemLucro) {
            this.margemLucro = margemLucro;
        }
        //metodos
        void erroValor(){
            if(precoCusto>precoVenda){
                System.out.println("\n-------------------------------------WARNING-------------------------------------");
                System.out.println("Inconssistencia de valores! \nO valor da compra não pode ser superir ao valor de venda,\npara ter dados relevantes reinicie o prograga e adicione os valores corretamente.");
                //System.out.println("\n---------------------------------------------------------------------------------");
                
            }
        }
        void calcularMargemlucro(){
            double lucro;
            lucro = precoVenda - precoCusto;
            System.out.println("A margen de lucro é de "+lucro);
        }
        void getMargemLucroPorcentagem(){
            double lucro;
            lucro = precoVenda/precoCusto;
            lucro = ((lucro*100)-100);
            System.out.println("O valor percentual de lucro é de "+lucro+"%");
        }
        

}
