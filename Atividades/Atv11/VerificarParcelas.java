public class VerificarParcelas{// Classe do programa VerificarParcelas
    public static void main(String[] args) { // Declaracao do método main que inicia a execução do programa
        
        //instanciando os objetos E1, E2 com a classe Emprestimo
        Emprestimo E1 = new Emprestimo();
        Emprestimo E2 = new Emprestimo();

        //Atribuindo os valores aos objetos E1 e E2
        
        E1.numeroParcelas = 6; //atribuindo numeroParcelas
        E1.taxaJuros = 0.2; //atribundo 20 % de juros
        E1.valorTotal = 600.0; //atribundo o valor total 

        E2.numeroParcelas = 7; //atribuindo numeroParcelas
        E2.taxaJuros = 0.1; //atribundo 10 % de juros
        E2.valorTotal = 50000.0; //Atribuindo 50 mil ao valorTotal 

        double proximaParcelaE1, proximaParcelaE2; //Declarando as variveis para receber o retorno do metodo proximaParcela
        System.out.println("Valores das parcelas: "); //print para informar os Valores das parcelas

        //metodo necessario para verificar e receber a parcela ao menos uma vez
        do {
            //pegando os valores de cada parcela e atribuindo as variaveis
            proximaParcelaE1 = E1.proximaParcela(); //retorna o valor da proximaParcelaE1
            proximaParcelaE2 = E2.proximaParcela(); //retorna o valor da proximaParcelaE2

            System.out.println("E1: " + proximaParcelaE1 + "\t E2: " + proximaParcelaE2); //saida com os valores das parcelas

        }while(proximaParcelaE1 > 0 && proximaParcelaE2 > 0); //caso ainda existam parcelas volta ao do verificando quantas parcelas existem ainda

    }// fim do metodo main
}// fim da classe VerificarParcelas