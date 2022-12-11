
import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 1;
        float y = 2.3f;
        double z = 2.3;
        char c = 'c';

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("has introducido " +edad);

        System.out.println("Introduce tu nombre ");
        String nombre = sc.next();

        System.out.println("has introducido " +nombre);

        int n1;
        int n2;

        System.out.println("Introduce el numero 1: ");
        n1 = sc.nextInt();
        System.out.println("Introduce el numero 2: ");
        n2 = sc.nextInt();


        System.out.println("La suma de los dos numeros es:  "+ (n1+n2));






    }


}
