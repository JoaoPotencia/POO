public class Emprestimo { // Classe do programa Emprestimo
    
    //Declarando os tipos das variaveis e criando os atributos publicos valorTotal, taxaJuros e numeroParcelas
    public double valorTotal;
    public double taxaJuros;
    public int numeroParcelas;
    
    //Declarando auxNumParecals que auxilia para verificar se existem parcelas disponiveis
    int auxNumParcelas = 0; 

    public double proximaParcela(){ //declarando metodo proximaParcela
        if ((this.numeroParcelas - this.auxNumParcelas) > 0){ //if se ainda existirem parcelas disponiveis
            final double juros = valorTotal * taxaJuros; //Calculo realizado dos juros de cada parcela
            double valor = (valorTotal / (double) numeroParcelas) + juros; //Calculo da parcela somando os juros
            auxNumParcelas++; //variavel auxNumParcelas recebe mais 1
            return valor; //retorna o valor da parcela ja acresentada com os juros
        } else { //caso nao tenha parcelas retornar -1
            return -1.0; 
        }
    } //fim do metodo proximaParcela

} //fim da classe Emprestimo
