import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input em uma única linha.
        System.out.println("Digite 10 numeros separados por espaço:");
        String valores = scanner.nextLine();
        //Separação dos numeros no input pelo metodo split, alocando-os em um vetor.
        String numerosLiterais[] = valores.split(" ");
        int numeros[] = new int[10];
        //Conversão das strings de numeros para inteiro.
        for(int i=0;i<10;i++){
            numeros[i] = Integer.parseInt(numerosLiterais[i]);
        }
        //Loop começando do ultimo elemento e indo para o primeiro para printar a entrada na ordem inversa.
        for(int i=9;i>=0;i--){
            System.out.print(numeros[i] + " ");
        }
        scanner.close();
    }
}
