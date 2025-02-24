import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 numeros separados por espaço:");
        String valores = scanner.nextLine();
        String numerosLiterais[] = valores.split(" ");
        int numeros[] = new int[10];
        for(int i=0;i<10;i++){
            numeros[i] = Integer.parseInt(numerosLiterais[i]);
        }
        for(int i=9;i>=0;i--){
            System.out.print(numeros[i] + " ");
        }
        scanner.close();
    }
}
