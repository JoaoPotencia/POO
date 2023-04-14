# Atividade 3:

-->Usando a classe JOptionPane para entrada de dados, crie uma classe que receba a nota de duas provas e de um trabalho. Calcule e mostre a média.

Classe impressão de texto: "Main".     
IFPR-Campus Cascavel.     
Aluno: João Vitor Santos Raimondi.     
Disciplina: Programação Orientada a Objetos.     
Professor: Nelson Bellincanta     


## Código
```
import javax.swing.JOptionPane;


public class Atvd03{

 

    public static void main(String[] args){

        String aux;

        float nota1, nota2 , notaTrabalho, media; //

        aux = JOptionPane.showInputDialog("Informe a primeira nota: ");
        nota1 = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Informe a segunda nota: ");
        nota2 = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog("Informe a nota do trabalho: ");
        notaTrabalho = Float.parseFloat(aux);


        media = (nota1 + nota2 + notaTrabalho)/3;
        
        JOptionPane.showMessageDialog(null,"Á media do aluno foi " + media);
    }

}
```


