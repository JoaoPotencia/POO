public class Testar {//Início da classe Testar
    
    public static void main(String[] args) {
        
        // Criando um objeto da classe Carro e passando os valores para o construtor
        Carro informacoes = new Carro("Toyota", "Supra", 1998, 2);
        
       // Chamando o método exibirDetalhes para mostrar as informações do objeto carro
        informacoes.exibirDetalhes();
        
        System.out.println();

        // Criando um objeto da classe Moto e passando os valores para o construtor
        Moto informacoes2 = new Moto("Harley-Davidson", "Sportster™ S ", 2023, 1200);
        
        // Chamando o método exibirDetalhes para mostrar as informações do objeto moto
        informacoes2.exibirDetalhes();
    }
}