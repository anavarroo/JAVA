import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre ");
        String nombre = sc.next();
        System.out.println("Introduce tu primer apellido ");
        String apellido1 = sc.next();
        System.out.println("Introduce tu segundo apellido ");
        String apellido2 = sc.next();


        //  1. Imprime por pantalla tu nombre.
        System.out.println("Tu nombre es " +nombre);

       //  2. Imprime por pantalla tu nombre y dos apellidos, cada uno en una línea.
        System.out.println("Tu nombre es " +nombre);
        System.out.println("Tu primer apellido es " +apellido1);
        System.out.println("Tu segundo apellido es " +apellido2);

        // 3.a Repite el ejercicio anterior pero imprimiendo todo en la misma línea.
        System.out.print("Tu nombre es " +nombre +", tu primer apellido es " +apellido1 +" y tu segundo apellido es " + apellido2);
        System.out.println("");

      //   3.b Repite el ejercicio anterior imprimiendo todo en la misma línea, usando tres instrucciones de impresión.
        System.out.print("Tu nombre es " +nombre );
        System.out.print(", tu primer apellido es " +apellido1);
        System.out.print(", tu segundo apellido es " +apellido2);
        System.out.println("");

    // Imprime tu edad
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu edad es: " +edad);

    // Imprime el primer digito de tu edad en una linea, y el segundo en otra
        edad = 19;
        System.out.println("1" + "9");


    // Imprime el primer digito de tu edad. Tras ellos y con una nueva instruccion, imprime el segundo. Tienen que aparecer ambos en la misma linea.

        System.out.println("1");
        System.out.println("9");
    }
}