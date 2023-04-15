# Atividade 3:

-->Usando a classe JOptionPane para entrada de dados, crie uma classe que receba a nota de duas provas e de um trabalho. Calcule e mostre a média.

Classe impressão de texto: "Main".     
IFPR-Campus Cascavel.     
Aluno: João Vitor Santos Raimondi.     
Disciplina: Programação Orientada a Objetos.     
Professor: Nelson Bellincanta     


## Código
```
import javax.swing.JOptionPane; //importação do pacote JOptionPane;


public class Atvd03{// Classe do programa

 
    //método principal do programa aqui que tudo inicia
    public static void main(String[] args){

        String aux;//Criando uma variavel do tipo String que vai receber a entrada dentro da caixa de entrada

        float nota1, nota2 , notaTrabalho, media;//criando as variaveis do tipo float

        aux = JOptionPane.showInputDialog("Informe a primeira nota: ");//Iniciando a caixa de entrada e dando o valor para a variavel aux
        nota1 = Float.parseFloat(aux);// transformando o valor da variavel "aux" (String) para a "nota1" (Float)
        
        aux = JOptionPane.showInputDialog("Informe a segunda nota: ");//Perguntando novamente na caixa pedindo a segunda nota
        nota2 = Float.parseFloat(aux);//transformando o valor da variavel "aux" (String) para a "nota2" (Float)

        aux = JOptionPane.showInputDialog("Informe a nota do trabalho: ");//Perguntando novamente na caixa pedindo a nota do trabalho
        notaTrabalho = Float.parseFloat(aux);// transformando o valor da variavel "aux" (String) para a "notaTrabalho" (Float)

        //calculo para fazer a media
        media = (nota1 + nota2 + notaTrabalho)/3;
        
        
        JOptionPane.showMessageDialog(null,"Á media do aluno foi " + media);//Imprimindo a saida
    }

}
```


