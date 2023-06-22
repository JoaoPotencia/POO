# Atividade 7:

-->Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média aritmética das notas.

Classe impressão de texto: "Main".     
IFPR-Campus Cascavel.     
Aluno: João Vitor Santos Raimondi.     
Disciplina: Programação Orientada a Objetos.     
Professor: Nelson Bellincanta     


## Código
´´
//importando bibliotecas
import java.lang.reflect.Array;

import java.util.Arrays;\n

import javax.swing.JOptionPane;


public class PrimeiroPrograma {

    //metodo principal
    public static void main(String[] args) {
        
        //declaração e alocação do vetor
        Double[] array = new Double[5];
        
        //criando variaveis
        String resposta = "";
        Double media = 0.0;
        
          //iniciando um for para repetir 5 vezes a entrada da nota
        for (int i = 0; i < 5; i++) {
            
            //entrada dos dados com a classe JOptionPane
            String entrada = JOptionPane.showInputDialog(null, "digite a nota: ");
            
            //transformando o indice do array em double
            array[i] = Double.parseDouble(entrada);
        }

        //organiza a array em forma decrescente
        Arrays.sort(array);
        
        //concatena a resposta com os valores obtidos e incrementa a variavel da media.
        for (int i = 4; i >= 0; i--) {
            resposta += array[i] + "\n";
            media += array[i];
        }
        
        //imprime os valores resposta e media com a classe JOptionPane
        JOptionPane.showMessageDialog(null, resposta);
        JOptionPane.showMessageDialog(null, "A média é: " + media/5);
        
    }
}

´´
