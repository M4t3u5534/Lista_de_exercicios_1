import java.util.Scanner;

public class Ex7 {
    //Função para contar vogais de uma frase.
    public static int contarVogais(String frase) {
        int quantidadeVogais = 0;
        //Vetor de vogais para comparação.
        String vogais[] = {"A","E","I","O","U"};
        //Atribuição dos caracteres da frase para um vetor de string convertendo-os para maiúsculos.
        String[] texto = frase.toUpperCase().split("");
        int tamanho_texto = texto.length;
        //Loop para comparar caracteres da frase digitada com as vogais.
        for(int i=0;i<tamanho_texto;i++){
            for(int j=0;j<5;j++){
                if(texto[i].equals(vogais[j])){
                    //Contagem das vogais.
                    quantidadeVogais++;
                    //Continuação do laço caso já tenha identificado que o caracter é vogal.
                    continue;
                }
            }
        }
        return quantidadeVogais;
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Input da frase
    System.out.println("Digite uma fase:");
    String frase = scanner.nextLine();
    //Rsultado da função.
    System.out.println("A frase tem " + contarVogais(frase) + " vogais");
    scanner.close();
    }
}
