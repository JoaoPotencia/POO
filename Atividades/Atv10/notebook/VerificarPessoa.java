public class VerificarPessoa{ // Classe do programa

    // Declarando o método main para execução do programa
    public static void main(String[] args) {
        
        //criando e instanciando o objeto individuo
        Pessoa individuo = new Pessoa();
        

        //ultilizando os metodos set no objeto individuo
        individuo.setNome("João"); //setando o nome
        individuo.setIdade(17); //setando a idade
        individuo.setAltura(1.85); //setando a altura

        //ultilizando os metodos get no objeto individuo
        
        System.out.println("Dados individuo: ");//print para orientar os dados do individuo
        
        System.out.println(individuo.getNome()); //metodo get usado para saida do nome do individuo
        
        //idadeindividuo recebe o retorno do metodo getIdade do individuo
        int idadeindividuo = individuo.getIdade(); 
        System.out.println(idadeindividuo); // printando a variavel idadeindividuo
        System.out.println(individuo.getAltura()); //metodo get usado para retornar a altura do objeto individuo

    }//fim do metodo main
}//fim da classe VerificarPessoa