import javax.crypto.spec.PSource;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* 1. Lee por pantalla un nombre y almacénalo en una variable. Imprime la variable
        por pantalla. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre ");
        String nombre = sc.next();
        System.out.println("Tu nombre es " +nombre);

       /* 2. Lee por pantalla una edad y almacénalo en una variable. Imprime la variable
        por pantalla. */

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu edad es: " +edad);


       /* 3. ¿Pueden modificarse los ejercicios anteriores para ahorrarse la variable?*/

        /* No porque todo dato debe introducirse en una variable. */

        /* 4.a Lee por pantalla una temperatura en grados Celsius e imprímela por pantalla.*/

        System.out.println("Introduce la temperatura: ");
        float temperatura = sc.nextFloat();
        System.out.println("La temperatura es: " +temperatura);


        /*  4.b Repite pero imprimiendo por pantalla en grados Kelvin (hay que convertir). */

        float kelvin= 33.8f;
        System.out.println("La temperatura en grados kelvin es: " +temperatura*kelvin);


        /* 5. Crea un programa que calcule el área de un rectángulo (base x altura),
        pidiendo por pantalla los datos necesarios.*/

        System.out.println("Introduce la base: ");
        int base= sc.nextInt();
        System.out.println("Introduce la altura: ");
        int altura= sc.nextInt();

        System.out.println("El area del rectangulo es " + base * altura);



        /* 6. Crea un programa que calcule el Índice de Masa Corporal (IMC), pidiendo
        por pantalla los datos necesarios.*/

        System.out.println("Introduce el peso en kg: ");
        float peso= sc.nextFloat();
        System.out.println("Introduce la altura en metros: ");
        float alturap= sc.nextFloat();

        System.out.println("El IMC es " + peso / alturap);



       /* 7. Crea un programa que lea el precio sin IVA de un producto e imprima
        el valor final con IVA del mismo. */

        System.out.println("Introduce el precio en euros sin IVA: ");
        float precio = sc.nextFloat();
        System.out.println("El precio del producto con IVA es " + ((precio*0.21)+precio));

       /* 8. Crea un programa que lea el precio sin IVA de tres productos e imprima
        el valor total con IVA que paga el comprador, así como el valor medio con y sin
        IVA. */

        System.out.println("Introduce el precio del producto 1 en euros sin IVA: ");
        float producto1 = sc.nextFloat();
        System.out.println("Introduce el precio del producto 2 en euros sin IVA: ");
        float producto2 = sc.nextFloat();
        System.out.println("Introduce el precio del producto 3 en euros sin IVA: ");
        float producto3 = sc.nextFloat();


        System.out.println("Valor total con IVA: " + ((producto1*0.21)+producto1)+ ((producto2*0.21)+producto2)+ ((producto3*0.21)+producto3));
        System.out.println("Valor medio con IVA: "+ (((producto1*0.21)+producto1)+ ((producto2*0.21)+producto2)+ ((producto3*0.21)+producto3))/3);
        float v = (producto1 + producto2 + producto3) / 3;
        System.out.println("Valor medio sin IVA: " +v);



        /*9. Crea un programa que lea el nombre de una persona, y a continuación su edad
        y altura, e imprima todo por pantalla en una misma línea. ¿Funciona? */

        System.out.println("Introduce tu nombre ");
        String nombre1 = sc.next();
        System.out.println("Introduce tu edad: ");
        int edad1 = sc.nextInt();
        System.out.println("Introduce la altura en metros: ");
        float altura2= sc.nextFloat();
        System.out.println("Tu nombre es " +nombre1 + "Tu edad es: " +edad + "Tu altura es: " + altura2);



              /*  10. Repita el ejercicio anterior pero leyendo primero los numeros y después
        el nombre. ¿Funciona? */

        System.out.println("Introduce tu edad: ");
        int edad2= sc.nextInt();
        System.out.println("Introduce la altura en metros: ");
        float altura3= sc.nextFloat();
        System.out.println("Introduce tu nombre ");
        sc.nextLine();
        String nombre2 = sc.nextLine();

        System.out.println("Tu nombre es " +nombre2 + "Tu edad es: " +edad2 + "Tu altura es: " + altura3);
    }
}
