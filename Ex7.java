import java.util.Scanner;

public class Ex7 {
    public static int contarVogais(String frase) {
        int quantidadeVogais = 0;
        String vogais[] = {"A","E","I","O","U"};
        String[] texto = frase.toUpperCase().split("");
        int tamanho_texto = texto.length;

        for(int i=0;i<tamanho_texto;i++){
            for(int j=0;j<5;j++){
                if(texto[i].equals(vogais[j])){
                    quantidadeVogais++;
                    continue;
                }
            }
        }
        return quantidadeVogais;
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite uma fase:");
    String frase = scanner.nextLine();
    System.out.println("A frase tem " + contarVogais(frase) + " vogais");
    scanner.close();
    }
}
