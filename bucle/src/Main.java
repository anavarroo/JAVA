import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce x: ");

        String x = sc.next();

        if (x!="a") {
            System.out.println("Coñazo de dia");
        }
        else {
            System.out.println("Dia normal");
        }


    }
}
