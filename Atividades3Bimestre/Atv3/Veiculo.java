/*
Classe impressão de texto: "Veiculo.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: João Vitor Santos Raimondi
*/

public class Veiculo { //Inicio da classe Veiculo
    private String marca;
    private String modelo;
    private int ano;
    
    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    // Pegando a marca com o método get
    public String getMarca() {
        return marca;
    }
    
    //Definindo a marca com o método set
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //Pegando o modelo com o método get
    public String getModelo() {
        return modelo;
    }
    
    //Definindo o modelo com o método set
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //Pegando o ano com o método get
    public int getAno() {
        return ano;
    }
    
    //Definindo o ano com o método set
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir os detalhes do veículo
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}