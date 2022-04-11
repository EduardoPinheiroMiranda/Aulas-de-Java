public class Carro {
    private String nome, marca, proprietario;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getProprietario(){
        return this.proprietario;
    }
    public void setProprietario(String proprietario){
        this.proprietario = proprietario;
    }

    void andar(){
        System.out.println("Estou andando");
    }

    public static void main(String[] args){
        Carro desc_car;
        desc_car = new Carro();
        desc_car.marca = "chevrolete";
        desc_car.nome = "prisma";
        desc_car.proprietario = "Eduardo"; 
        System.out.println("\n"+desc_car.getNome());
        System.out.println(desc_car.getMarca());
        System.out.println(desc_car.getProprietario());
        desc_car.andar();
    }
}
