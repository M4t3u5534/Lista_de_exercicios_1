import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 numeros separados por espaço:");
        String valores = scanner.nextLine();
        String numerosLiterais[] = valores.split(" ");
        int numeros[] = new int[10];
        for(int i=0;i<10;i++){
            numeros[i] = Integer.parseInt(numerosLiterais[i]);
        }
        for(int i=9;i>0;i--){
            for(int j=0;j<i;j++){
                if(numeros[j]>numeros[i]){
                    int aux = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
        System.out.println("O maior numero é: " + numeros[9] + "\nO menor numero é: " + numeros[0]);
        scanner.close();
    }
}
