# Atividade 4:

-->Atualmente os gastos mensais de uma empresa são detalhados em planilhas eletrônicas. Assim, para fechar o balanço do
primeiro trimestre, é necessário somar o gasto total destas planilhas. Sabendo que, em janeiro, foram gastos R$ 30.000,00 reais, em fevereiro, R$ 33.030,77 reais e em março, R$ 23.899,01 reais, faça uma classe em Java que calcule e exiba o gasto total no trimestre, seguindo os seguintes passos:

a) Crie uma classe chamada BalancoTrimestral com o método main;     
b) No método principal, declare uma variável do tipo real chamada gastosJaneiro e inicialize-a com o valor gasto no mês de janeiro;    
c) Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os respectivos gastos, utilize uma linha para cada declaração;     
d) Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis;     
e) Exiba a variável gastosTrimestre.     

Classe impressão de texto: "Main".     
IFPR-Campus Cascavel.     
Aluno: João Vitor Santos Raimondi.     
Disciplina: Programação Orientada a Objetos.     
Professor: Nelson Bellincanta     


## Código
```
public class BalancoTrimestral{//Classe do programa
   
   // método principal do programa
   public static void main(String[] args){
        
        //declarando variaveis
        int GastosJaneiro = 30000;
       
        int GastosFevereiro =33000;
        
        int GastosMarço = 23999;

        //calculo para saber quanto gastou no trimestre e essa operação salvando em gastosTrimestre
        int gastosTrimestre =  GastosJaneiro + GastosFevereiro + GastosMarço;

        //
        System.out.println("Total dos gastos no Trimestre:  "+ gastosTrimestre);//Imprimindo o gastoTrimestral

    }


}
```
