# Atividade 6:

-->Dados os valores de um depósito fixo mensal e um montante desejado, crie uma classe para determinar quantos meses serão necessários para acumular o montante desejado, considerando juros mensais de 0,5%.

Classe impressão de texto: "Main".     
IFPR-Campus Cascavel.     
Aluno: João Vitor Santos Raimondi.     
Disciplina: Programação Orientada a Objetos.     
Professor: Nelson Bellincanta     


## Código
```


import java.util.Scanner;// importação do pacote Scanner

public class MontanteDesejado{// Classe do programa

    // Mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
    static Scanner LER = new Scanner(System.in);


    //metodo principal
    public static void main(String[] args){

        //declarando variavies
        double depositoMensal;
        double montanteDesjado;
        int meses = 1;
        double c = 0;


        System.out.print("Informe o valor do deposito fixo mensal: "); //Imprimindo uma pergunta do valor de deposito mensal;
        depositoMensal = LER.nextDouble(); // LER pega o próximo double do teclado para colocar na variável depositoMensal
        
        System.out.print("\nInforme o montante desejado: "); //Imprimindo uma pergunta do valor de monte desejado
        montanteDesjado = LER.nextDouble();// LER pega o próximo double do teclado para colocar na variável montanteDesejado


        c = depositoMensal; //a variavel c recebe o valor do deposito
          
          while (c < montanteDesjado){ //um while enquanto c for menor que o montante desejado
              
              c = c + (depositoMensal * 1.05); //c recebe c + o salario mensal
              meses = meses + 1; //contagem de meses que recebe os meses ao decorrer do tempo;
          
          }
          
        System.out.printf("%nSerá necessario %s meses até chegar no monte desejado.%n", meses);//Imprimindo a quantidade de meses
        
        System.out.printf("O Valor adquirido nesses %d meses foi de: R$%.2f", meses, c);//imprimindo o valor adquirido dos meses;

    }

}

```


