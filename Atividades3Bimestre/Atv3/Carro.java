// Início da classe Carro, que herda da classe Veiculo
public class Carro extends Veiculo {
    private int numeroDePortas;
    
   // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano); // Chamando o construtor da classe Veiculo
        this.numeroDePortas = numeroDePortas;
    }
    
    // Pegando o numerodePortas do carro
    public int getNumeroDePortas() {
        return numeroDePortas;
    }
    
    //definindo o número de portas do carro
    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    // Sobrescrevendo o método exibirDetalhes da classe Veiculo
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chamando o método da classe Veiculo
        System.out.println("Número de Portas: " + numeroDePortas); //Print do numeroDePortas
    }
    
}
