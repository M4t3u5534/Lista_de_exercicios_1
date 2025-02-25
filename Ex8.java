import java.util.Scanner;

class Ponto {
    int x;
    int y;
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Ex8 {
    public static boolean haColisaoEntreCirculos(Ponto p1, int r1,Ponto p2,int r2){
        int soma_dos_raios = r1 + r2;
        double a = Math.abs(p1.x - p2.x);
        double b = Math.abs(p1.y - p2.y);
        double distnacia_dos_centros = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        if(soma_dos_raios >= distnacia_dos_centros)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as cordanadas x e y e raio do circulo 1 divididas por espaco:"); 
        String[] ponto = scanner.nextLine().split(" ");
        Ponto p1 = new Ponto(Integer.parseInt(ponto[0]),Integer.parseInt(ponto[1]));
        int r1 = Integer.parseInt(ponto[2]);

        System.out.println("Digite as cordanadas x e y e raio do circulo 2 divididas por espaco:"); 
        ponto = scanner.nextLine().split(" ");
        Ponto p2 = new Ponto(Integer.parseInt(ponto[0]),Integer.parseInt(ponto[1]));
        int r2 = Integer.parseInt(ponto[2]);
        System.out.println("Os circulos estao sobrepostos? " + haColisaoEntreCirculos(p1, r1, p2, r2));
        scanner.close();
    }
}
