import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Bloco Try Catch para garantir que o valor digitado seja um inteiro.
    try {
      //Inputs e alocação das variáveis.
      System.out.println("Digite o valor 1: ");
      int valor1 = scanner.nextInt();
      System.out.println("Digite o valor 2: ");
      int valor2 = scanner.nextInt();
      //Troca do conteúdo das variáveis.
      int aux = valor1;
      valor1 = valor2;
      valor2 = aux;
      System.out.println("Valor 1 = " + valor1 + " valor 2 = " + valor2);
   } catch (InputMismatchException e) {
      System.out.println("O valor digitado deve ser um inteiro!");
   }
    scanner.close();
 }
}