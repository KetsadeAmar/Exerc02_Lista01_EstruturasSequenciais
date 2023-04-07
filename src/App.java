 import java.util.Scanner;
 
 public class App {

    // Início do Programa
    public static void main(String[] args) throws Exception {
    
          // Declaração de variaveis
        int numero;
        
        // Solicitação de Dados
       Scanner teclado = new Scanner(System.in);
       System.out.println ("Digite um numero: ");
       numero = teclado.nextInt();
       teclado.close();
       
       // Saída de Dados
       System.out.println ("O número informado foi: " + numero);
       


    }
}  