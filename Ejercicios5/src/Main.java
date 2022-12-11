import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 1. Lee por pantalla dos numeros enteros y almacene en una variable el resultado de comprobar si el primero es superior al segundo multiplicado por dos. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero 1: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce el numero 2: ");
        int n2 = sc.nextInt();

        n2 = n2*2;
        boolean resultado =n1>n2;

        System.out.println(resultado);

        /* 2. Lea por pantalla una edad y almacene en una variable el resultado de comprobar si es mayor de edad */

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        boolean variable = edad>18;
        System.out.println(variable);

        /* 3. Repita pero comprobando si es menor de edad. */
        System.out.println("Introduce tu edad: ");
        int edad2 = sc.nextInt();
        boolean variable2 = edad2<18;
        System.out.println(variable2);

        /* 4. Lea por pantalla un numero entero y almacene en una variable el resultado de comprobar si es par. */
       /* System.out.println("Introduce el numero: ");
        int numero=  sc.nextInt();
        boolean variable3 = numero%2;*/
        /* 5.Repita pero comprobando si es impar */
    }
}

