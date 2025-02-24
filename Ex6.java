import java.util.Scanner;

public class Ex6 {
    public static float mulComAdicao(float numero1, int numero2){
        float soma = 0;
        for(int i=numero2;i>0;i--)
            soma+=numero1;
        return soma;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero:");
        float numero1 = scanner.nextFloat();
        System.out.println("Ditgite um numero inteiro:");
        int numero2 = scanner.nextInt();
        System.out.println("A multiplicação de " + numero1 + " por " + numero2 + " resulta em: " + mulComAdicao(numero1, numero2));
        scanner.close();
    }
}
