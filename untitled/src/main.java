import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("x: ");
        int x = sc.nextInt();
        System.out.println("y: ");
        int y = sc.nextInt();


        int contador = 0;


        for(int i = 0;i<=x;i++){
            for (int j = 0;j<=y;j++){
                System.out.printf("(%d, %d)", i, j);
                contador++;
            }
            System.out.printf("\n");
        }
        System.out.println("se ha ejecutado " + contador + " veces");
    }
}
