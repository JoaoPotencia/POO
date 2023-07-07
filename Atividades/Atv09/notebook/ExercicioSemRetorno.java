public class ExercicioSemRetorno{ // Classe do programa
    
   // Declarando o método para execução do programa
   public static void main(String[] args) {
       
    //Alocacando e declarando, e inicializando a "array" 
       int[] array = {223, 22, 3, 6, 1, 4, 78, 1, 3, 20};

       //chamando o metodo imprimirNumeros para imprimir a array 
       imprimirNumeros(array);

       //Alocacando e declarando, e inicializando a "array2" 
       int[] array2 = {39, 23, 22, 58, 4, 6, 2, 5, 9, 1};

       //chamando o metodo somaNumeros para somar os dois array
       somaNumeros(array, array2);
       
   } //fim do metodo main
   
   // Declaração do método imprimirNumeros que recebe uma array de inteiros e imprime os números
   public static void imprimirNumeros(int[] array) {
       System.out.println("Saida da array: ");
       
       //Um for que percorre a array e imprime cada posição
       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + "\t");
       }
       
       //Um print para quebrar a linha
       System.out.println();
   } 

   //declaracao do método imprimirNumeros que faz a soma de dois array como parametro 
   public static void somaNumeros (int[] array, int[] array2) {
       
       //declaração e alocação do arraySoma com o tamanho do array
       int[] arraySoma = new int[array.length];

       //Um for que realiza a soma dos array e array2 e atribui o valor para arraySoma
       for (int i = 0; i < array.length; i++) {
           arraySoma[i] = array[i] + array2[i];
       }

       //saidas para orientação
       System.out.println();
       System.out.println("Saida do array somado");
       
       //Chamando o metodo imprimirNumeros para printar arraySoma
       imprimirNumeros(arraySoma);
   
   }// fim do metodo somaNumeros

}//fim da classe ExercicioSemRetorno
