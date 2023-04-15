# Atividade 5:

-->Adicione a Atv04 (sem alterar as linhas existentes) o cálculo para a média mensal de gastos, criando uma variável mediaMensal junto com uma mensagem. Para isso, concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal.

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

        System.out.println("Total dos gastos no Trimestre:  "+ gastosTrimestre);//Imprimindo o gastoTrimestral

       //chamando o metodo calculoMensal
        calculoMensal(gastosTrimestre);

    }public static void calculoMensal(int gastosTrimestre){ //metodo para calcular o gasto mensal

        int mediaMensal = (gastosTrimestre/3); //calculo para saber a media mensal

        System.out.println("Valor da média mensal = " + mediaMensal); //Imprimindo a mediaMensal
    }

}
```
