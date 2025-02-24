import java.util.Scanner;

public class Ex5 {
    public static int min(int numero1,int numero2){
        if (numero1>numero2)
            return numero2;
        else
            return numero1;
    }
    public static int max(int numero1,int numero2){
        if (numero1>numero2)
            return numero1;
        else
            return numero2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento e a largura do retangulo 1:");
        String valores1 = scanner.nextLine();
        String retangulo1[] = valores1.split(" ");

        System.out.println("Digite o comprimento e a largura do retangulo 2:");
        String valores2 = scanner.nextLine();
        String retangulo2[] = valores2.split(" ");
        int area1 = Integer.parseInt(retangulo1[0])*Integer.parseInt(retangulo1[1]);
        int area2 = Integer.parseInt(retangulo2[0])*Integer.parseInt(retangulo2[1]);
        int menor = min(area1,area2);
        int maior = max(area1, area2);
        if(area1 == menor)
            System.out.println("O retangulo 1 é o menor");
        else
            System.out.println("O retangulo 2 é o menor");

        if(area1 == maior)
            System.out.println("O retangulo 1 é o maior");
        else
            System.out.println("O retangulo 2 é o maior");
        scanner.close();
    }
}
