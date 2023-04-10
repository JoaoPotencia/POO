# Atividade 1:

-->Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.

Classe impressão de texto: "Main".     
IFPR-Campus Cascavel.     
Aluno: João Vitor Santos Raimondi.     
Disciplina: Programação Orientada a Objetos.     
Professor: Nelson Bellincanta     


## Código
```
import java.util.Scanner; // importação do pacote Scanner

public class atv1{ // Classe do programa

    // Mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
    final static Scanner LER = new Scanner(System.in); 
    
    public static void main(String[] args){ // método principal do programa 
    
    // Declaração das variáveis        
    float nmr1 = 0f;
    float nmr2 = 0f;
    float result = 0f;



    System.out.println("Digite o primeiro número: ");// Mensagem para o usuário
    nmr1 = LER.nextFloat();// LER pega o próximo float do teclado para colocar na variável nmr1
    
    System.out.println("Digite o segundo número: ");// Mensagem para o usuário
    nmr2 = LER.nextFloat();// LER pega o próximo float do teclado para colocar na variável nmr2

    // chamada e passagem dos parâmetros para o método calcular a soma
    result = Calcular(nmr1, nmr2, result);
    
    Imprimir(result); //chamada ao método para imprimir o resultado da soma


    } // Definição do método Calcular que recebe como parâmetro a variável nmr1, nmr2 e a soma desses dois guardados na variavel result
    public static float Calcular(float nmr1, float nmr2, float result){
        
        result = nmr1 + nmr2; // guarda o resultado da soma nmr1 + nmr2 em result
        
        return result; // retorna para o main devolvendo o valor do result

    // Definição do método imprimir que recebe como parâmetro result e não tem retorno (ou o retorno é void/vazio)
    }public static void Imprimir(float result){
        
        System.out.print("O resultado da soma é: " + result); // Mensagem para o usuário + junta a mensagem com o valor da variável
    }
}
```

