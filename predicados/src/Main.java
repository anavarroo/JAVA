import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /* Paso 1: Instancia 2 variables de tipo booleano cuyo nombre sean:
        -predicado1
        -predicado0

        Paso 2: Asignale a predicado1 el valor verdadero y a predicado0 el valor falso */

        boolean predicado1 = true;
        boolean predicado0 = false;

       /*  Paso 3: Imprime por pantalla con salto de linea las siguientes concatenaciones: */

        System.out.println("Verdadero "+ predicado1);
        System.out.println("No verdadero: "+ !predicado1);
        System.out.println(   "Falso: " + predicado0);
        System.out.println(  "No Falso: " + !predicado0);

        System.out.println("Verdadero y Falso: " + (predicado1&&predicado0));
        System.out.println("Verdadero y Verdadero: " + (predicado1&&predicado1));
        System.out.println("Falso y Falso: " + (predicado0&&predicado0));
        System.out.println("Falso y Verdadero: " + (predicado0&&predicado1));

        System.out.println("Verdadero o Falso: " + (predicado1 || predicado0));
        System.out.println("Verdadero o Verdadero: " + (predicado1 || predicado1));
        System.out.println("Falso o Falso: " + (predicado0 || predicado0));
        System.out.println("Falso o Verdadero: " +( predicado0 || predicado1));

        System.out.println("¿Verdadero = Falso?: " + (predicado1 == predicado0));
        System.out.println("¿Verdadero = Verdadero?: " + (predicado1 == predicado1));
        System.out.println("¿Falso = Falso?: " + (predicado0 == predicado0));
        System.out.println("¿Falso = Verdadero?: " + (predicado0 == predicado1));

        System.out.println("¿Verdadero distinto de Falso?: " + (predicado1 != predicado0));
        System.out.println("¿Verdadero distinto de Verdadero?: " + (predicado1 != predicado1));
        System.out.println("¿Falso distinto de Falso?: " + (predicado0 != predicado0));
        System.out.println("¿Falso distinto de Verdadero?: " + (predicado0 != predicado1));



        /* Paso 4: Copia todas las instrucciones del paso 3 salvo las cuatro primeras.
        Modifica la cadena de caracteres de cada una de las lineas añadiendole
        un "NO( " al principio del texto, y un ) justo antes de los dos puntos y
        añadiendole el operador ! delante del parentesis de la operacion entre
        booleanos como en el siguiente ejemplo que corresponderia a la
        primera linea a modificar:

        -"NO( " + "Verdadero y Falso ): " + !(predicado1 && predicado0) */

        System.out.println("NO( "+ "Verdadero y Falso): " + !(predicado1&&predicado0));
        System.out.println("NO( "+ "Verdadero y Verdadero: " + (predicado1&&predicado1));
        System.out.println("NO( "+ "Falso y Falso: " + (predicado0&&predicado0));
        System.out.println("NO( "+ "Falso y Verdadero: " + (predicado0&&predicado1));

        System.out.println("NO( "+ "Verdadero o Falso: " + (predicado1 || predicado0));
        System.out.println("NO( "+ "Verdadero o Verdadero: " + (predicado1 || predicado1));
        System.out.println("NO( "+ "Falso o Falso: " + (predicado0 || predicado0));
        System.out.println("NO( "+ "Falso o Verdadero: " +( predicado0 || predicado1));

        System.out.println("NO( "+ "¿Verdadero = Falso?: " + (predicado1 == predicado0));
        System.out.println("NO( "+ "¿Verdadero = Verdadero?: " + (predicado1 == predicado1));
        System.out.println("NO( "+ "¿Falso = Falso?: " + (predicado0 == predicado0));
        System.out.println("NO( "+ "¿Falso = Verdadero?: " + (predicado0 == predicado1));

        System.out.println("NO( "+ "¿Verdadero distinto de Falso?: " + (predicado1 != predicado0));
        System.out.println("NO( "+ "¿Verdadero distinto de Verdadero?: " + (predicado1 != predicado1));
        System.out.println("NO( "+ "¿Falso distinto de Falso?: " + (predicado0 != predicado0));
        System.out.println("NO( "+ "¿Falso distinto de Verdadero?: " + (predicado0 != predicado1));


       /* Paso 5: Copia todas las instrucciones del paso 3 salvo las cuatro primeras.
        Modifica la cadena de caracteres de cada una de las lineas añadiendole
        un NO delante del segundo valor y añadiendole el operador ! delante de
        la segunda variable como en el siguiente ejemplo que corresponderia a la
        primera linea a modificar:

        "Verdadero y No Falso: " + (predicado1 && !predicado0) */


        System.out.println("Verdadero y  No Falso: " + (predicado1&&!predicado0));
        System.out.println("Verdadero y No Verdadero: " + (predicado1&&!predicado1));
        System.out.println("Falso y No Falso: " + (predicado0&&!predicado0));
        System.out.println("Falso y No Verdadero: " + (predicado0&&!predicado1));

        System.out.println("Verdadero o No Falso: " + (predicado1 || !predicado0));
        System.out.println("Verdadero o No Verdadero: " + (predicado1 || !predicado1));
        System.out.println("Falso o No Falso: " + (predicado0 || !predicado0));
        System.out.println("Falso o No Verdadero: " +( predicado0 || !predicado1));

        System.out.println("¿Verdadero = Falso?: " + (predicado1 == !predicado0));
        System.out.println("¿Verdadero = Verdadero?: " + (predicado1 == !predicado1));
        System.out.println("¿Falso = Falso?: " + (predicado0 == !predicado0));
        System.out.println("¿Falso = Verdadero?: " + (predicado0 == !predicado1));

        System.out.println("¿Verdadero distinto de Falso?: " + (predicado1 != !predicado0));
        System.out.println("¿Verdadero distinto de Verdadero?: " + (predicado1 != !predicado1));
        System.out.println("¿Falso distinto de Falso?: " + (predicado0 != !predicado0));
        System.out.println("¿Falso distinto de Verdadero?: " + (predicado0 != !predicado1));

        /* Ejercicio Practico:	Diseñar un algoritmo que nos indique si podemos salir a la calle.
			Existen aspectos que nos influyen en esta decision: si esta lloviendo
			y si hemos terminado nuestras tareas. Solo podemos salir a la calle si
			no esta lloviendo y hemos finalizado nuestras tareas. Existe un opcion
			en la que, indistintamente de lo anterior, podremos salir a la calle:
			el hecho de que tengamos que ir a la biblioteca (para realizar algun trabajo,
			entregar los libros...). Solicitar al usuario (mediante un booleano) si llueve,
			si ha finalizado las tareas y si necesita ir a la biblioteca. El algoritmo debe
			mostrar mediante un booleano si es posible que se le otorgue permiso para ir a la calle.

			La solucion de este ejercicio se dara solo en 9 lineas, que constaran de:
			-La linea de instanciacion del scanner: Scanner sc = new Scanner(System.in);
			-Una linea en la que instanciaremos las 3 variables a usar, sin darle valor.
			-6 lineas, las cuales seran una para imprimir por pantalla la pregunta que se le hara al usuario
			 	y otra en la que le daremos valor a la variable solicitandola al usuario por el scanner
			-Una última linea en la que imprimiremos por pantalla: "¿Puedo salir a la calle?" + (la operacion logica de respuesta) */


        Scanner sc = new Scanner(System.in);

        boolean lluvia, tareas, biblioteca;

        System.out.println("Esta lloviendo?: ");
        lluvia = sc.nextBoolean();
        System.out.println("Has terminado las tareas?: ");
        tareas = sc.nextBoolean();
        System.out.println("Tienes que ir a la biblioteca?: ");
        biblioteca = sc.nextBoolean();

        System.out.println( "Puedo salir a la calle?: " + ((!lluvia&&tareas) || (biblioteca)));


    }
}
