import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Bloco Try Catch para garantir que será digitada uma string.
        try {
            //Vetor de vogais para fazer a verificação da letra.
            String vogais[] = {"A","E","I","O","U"};
            //Input.
            System.out.println("Digite uma letra:");
            String vogal = scanner.next();
            //Loop para garantir que a letra digitada será comparada com todas as vogais.
            for(int i=0;i<5;i++){
                if(vogal.equalsIgnoreCase(vogais[i])){
                System.out.println("A letra digitada é uma vogal.");
                scanner.close();
                return;
                }
            }
            System.out.println("A letra digitada é uma consoante.");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Você deve digitar uma letra!");
        }
        
    }
}