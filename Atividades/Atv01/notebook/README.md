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
    
    final static Scanner LER = new Scanner(System.in); // Mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
    
    // Declaração das variáveis  
    float nmr1 = 0f;
    float nmr2 = 0f;
    float result = 0f;

    System.out.println("Digite o primeiro número: ");// Mensagem para o usuário
    nmr1 = LER.nextFloat();// LER pega o próximo float do teclado para colocar na variável nmr1
    
    System.out.println("Digite o segundo número: ");
    nmr2 = LER.nextFloat();
    
    result = nmr1 + nmr2; // guarda o resultado da soma nmr1 + nmr2 em result

    System.out.print("O resultado da soma é: " + result); // Mensagem para o usuário + junta a mensagem com o valor da variável
```

