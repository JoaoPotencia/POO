public class Pessoa{ // Classe do programa
    
  //Declarando variaveis de atributos privados nome, idade e altura
  private String nome;
  private int idade;
  private double altura;

    //metodo public,declarado como getNome, para retornar String do nome do objeto
  public String getNome(){
    return nome;
  }
  //metodo public, declarado como getIdade, para retornar inteiro da idade do objeto
  public int getIdade() {
    return idade;
  }
  //metodo public, declarado como getAltura, para retornar double da altura do objeto
  public double getAltura() {
    return altura;
  }
  
  //metodo sem retorno, declarado como setNome para setar o nome do tipo String
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  //metodo sem retorno, declarado como setIdade para setar a idade do tipo inteiro
  public void setIdade(int idade) {
    this.idade = idade;
  }
  //metodo sem retorno, declarado como setAltura para setar a altura do tipo double
  public void setAltura(double altura) {
    this.altura = altura;
  }
}
