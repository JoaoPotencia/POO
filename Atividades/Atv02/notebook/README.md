# Atividade 2:

-->Crie uma classe em Java que realize cada uma das seguintes tarefas:

a) Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha;

b) Atribuir o produto de variáveis b e c para a variável a;

c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.


Classe impressão de texto: "Main".     
IFPR-Campus Cascavel.     
Aluno: João Vitor Santos Raimondi.     
Disciplina: Programação Orientada a Objetos.     
Professor: Nelson Bellincanta     


## Código

```

import java.util.Scanner;// importação do pacote Scanner

public class Atvd02 {//Classe

    static Scanner LER = new Scanner(System.in);//Mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
    
    //metodo principal
    public static void main(String[] args){
        
        //declarando variáveis
        int a = 0;
        int b = 7;
        int c = 4;

        a = (b * c);//"a" recebe o produto de "b" vezes "c" e salva em a


        System.out.println("Informe um inteiro: "+ a);//Mensagem para o usuário + junta a mensagem com o valor da variável
        
        
        System.out.println(": " + a);// Mensagem para o usuário + junta a mensagem com o valor da variável


    }
}

```
