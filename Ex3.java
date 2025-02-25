import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input em uma unica linha.
        System.out.println("Digite 10 numeros separados por espaço:");
        String valores = scanner.nextLine();
        //Separação dos numeros no input pelo metodo split, alocando-os em um vetor.
        String numerosLiterais[] = valores.split(" ");
        float numeros[] = new float[10];
        //Conversão das strings de numeros para ponto flutuante.
        for(int i=0;i<10;i++){
            numeros[i] = Float.parseFloat(numerosLiterais[i]);
        }
        //Lógica de ordenação em ordem crescente.
        for(int i=9;i>0;i--){
            for(int j=0;j<i;j++){
                if(numeros[j]>numeros[i]){
                    float aux = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
        System.out.println("O maior numero é: " + numeros[9] + "\nO menor numero é: " + numeros[0]);
        scanner.close();
    }
}
