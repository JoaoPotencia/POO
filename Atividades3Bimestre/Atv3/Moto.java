//Início da classe Moto, que herda da classe Veiculo
public class Moto extends Veiculo {
    private int cilindradas;
    
    // Construtor da classe Moto
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano); // Chamando o construtor da classe Veiculo
        this.cilindradas = cilindradas;
    }
    
    //  Pegando as cilindradas  da moto
    public int getCilindradas() {
        return cilindradas;
    }
    
    // Definindo as cilindradas da moto
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Sobrescrevendo o método exibirDetalhes da classe Veiculo
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chamando ao método Classe Veiculo
        System.out.println("Cilindradas: " + cilindradas); //Print para printar as cilindradas da moto
    }
    
} 