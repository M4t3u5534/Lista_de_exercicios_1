import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String vogais[] = {"A","E","I","O","U"};
            System.out.println("Digite uma letra:");
            String vogal = scanner.next();
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