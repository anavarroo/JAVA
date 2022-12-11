import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println("---------------------------------------------\n");

        System.out.println("Selecciona genero (1=Mujer, 2=Hombre):");
        int selección = sc.nextInt();
        String genero;
        String clase;

        if (selección == 2) {
            genero = "Hombre";
            System.out.println("Has elegido Hombre\n");
            System.out.println("Clases: \nClase Buscavidas\nClase Guerrero\nClase Mago\nSelecciona Clase:");
            selección = sc.nextInt();

            switch (selección) {
                case 2: clase = "Guerrero"; break;
                case 3: clase = "Mago";break;
                default: clase = "Buscavidas";break;
            }
        } else {
            genero = "Mujer";
            System.out.println("Has elegido Mujer\n");
            System.out.println("Clases: \nClase Asesina\nClase Druida\nClase Amazona\nSelecciona Clase:");
            selección = sc.nextInt();

            switch (selección) {
                case 2: clase = "Druida"; break;
                case 3: clase = "Amazona";break;
                default: clase = "Asesina";break;
            }
        }
        System.out.println("Has seleccionado " + genero + " de clase " + clase);

        System.out.println("\n---------------------------------------------");
        System.out.println("Ejercicio 2");
        System.out.println("---------------------------------------------\n");

        int n;
        do {
            System.out.print("Selecciona un ejercicio entre 1 y 4 (Pulsar 0 para salir del programa): ");
            n = sc.nextInt();
            System.out.println("\n---------------------------------------------");
            switch (n) {
                case 0:
                    System.out.println("Examen finalizado con éxito!"); break;
                case 1:
                    System.out.println("Ejercicio 1 finalizado."); break;
                case 2:
                    System.out.println("Ejercicio 2 finalizado.");break;
                case 3:
                    System.out.println("Ejercicio 3 finalizado.");break;
                case 4:
                    System.out.println("Ejercicio 4 finalizado.");break;
                default:
                    System.out.println("Error, número fuera de rango.");break;
            }
            System.out.println("---------------------------------------------\n");
        } while (n!=0);

        System.out.println("---------------------------------------------");
        System.out.println("Ejercicio 3");
        System.out.println("---------------------------------------------\n");

        /*
            Vamos a comenzar con el ejercicio del triangulo visto en clase:
        */

        String rojo = "\033[0;31m";
        String amarillo = "\033[0;33m";
        String reset = "\033[0m";

        System.out.println("\nIntroduce tamaño del triangulo:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        /*
            Ahora seleccionamos la otra parte de la matriz, que es la condición contraria:
        */

        System.out.println("\nIntroduce tamaño del triangulo contrario:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i<=j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        /*
         Daros cuenta que hasta ahora, si dibujasemos los ejes de coordenadas, java está escribiendo el eje positivo de
         las i hacia abajo. De la forma en que solemos los humanos representar los ejes, i deberia de ir incrementandose
         hacia arriba y decrementandose hacia abajo. Vamos a representar el eje i como deberia y nos daremos cuenta que
         esta invirtiendo el triangulo anterior respecto a la vista que hemos ido haciendo, pero en nuestra forma de
         representar los ejes estaría en su forma natural:
        */

        System.out.println("\nIntroduce tamaño del triangulo anterior a nuestro modo de ver:");
        n = sc.nextInt();
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i<=j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        /*
            Si quisiesemos seguir dibujando en el cuarto cuadrante con la vista humana, tenemos que tener en cuenta que
            para que la relaciones entre i y j se cumplan, hay que tomar en el condicionante el valor absoluto de i, ya
            que en el cuarto cuadrante i nos aparecerá como negativo.
        */

        System.out.println("\nIntroduce tamaño del triangulo anterior inverso:");
        n = sc.nextInt();

        for (int i = 0; i > -n; i--) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i)<=j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        /*
            Como veis la diferencia entre los dos ultimos solo radica en el for i, ya que el interior de ese for i es
            el mismo en ambos casos. Además los for i pueden unirse como uno solo, ya que el segundo va de (-n, 0] y el
            primero va de [0,n). Por tanto podriamos poner un i que recorriese (-n, n).
        */

        System.out.println("\nIntroduce tamaño del banderin inverso:");
        n = sc.nextInt();
        for (int i = n-1; i > -n; i--) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i)<=j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        /*
            Una vez lo tenemos así, solo faltaría darle color. Todos los * tienen que ser amarillos SALVO la diagonal,
            que es cuando coinciden las i y las j iguales, y salvo en j=n-1, que en todos estos casos se pintaria rojo
        */

        System.out.println("\nIntroduce tamaño del banderin inverso coloreado:");
        n = sc.nextInt();
        for (int i = n-1; i > -n; i--) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i)==j || j==n-1) {
                    System.out.print(rojo + "* " + reset);
                }else if (Math.abs(i)<j) {
                    System.out.print(amarillo + "* " + reset);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        /*
            Pero Joaquín, el ejercicio pedia primero el banderin, no el banderin inverso...

            Respuesta: Probad a borrar toda la parte del else del banderin inverso sin colorear...    ?=^D
        */

        System.out.println("\nIntroduce tamaño del banderin:");
        n = sc.nextInt();
        for (int i = n-1; i > -n; i--) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i)<=j) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        /*
            Para colorearlo, debeis simplemente copiar el banderin inverso coloreado y borrarle de nuevo el else:
        */

        System.out.println("\nIntroduce tamaño del banderin coloreado:");
        n = sc.nextInt();
        for (int i = n-1; i > -n; i--) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i)==j || j==n-1) {
                    System.out.print(rojo + "* " + reset);
                }else if (Math.abs(i)<=j) {
                    System.out.print(amarillo + "* " + reset);
                }
            }
            System.out.println();
        }

        /*
            Otras soluciones:
         */

        System.out.println("\n---------------------------------------------");
        System.out.println("Soluciones matematicas:");
        System.out.println("---------------------------------------------\n");


        System.out.println("");
        System.out.println("introduce tamaño en el que quieres el banderín:");
        n = sc.nextInt();

        for (int i = n-1; i > -n; i--) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i)==n-1-j || j == 0) {
                    System.out.print(rojo + "* " + reset);
                }
                else if (Math.abs(i)<n-1-j) {
                    System.out.print(amarillo + "* " + reset);
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        /*
            El inverso de n-1-j
         */
        System.out.println("\nintroduce tamaño en el que quieres el banderín invertido:");
        n = sc.nextInt();

        for (int i = n-1; i > -n; i--) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i)==j || j == n-1) {
                    System.out.print(rojo + "* " + reset);
                }
                else if (Math.abs(i)<j) {
                    System.out.print(amarillo + "* " + reset);
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println("---------------------------------------------");
        System.out.println("Ejercicio 4");
        System.out.println("---------------------------------------------\n");

        /*
            En este ejercicio se sobreentendia que:
                -si has hecho los ejercicios 1, 2 y 4 no habias intentado el 3 (Por las instrucciones del simulacro)
                -si has hecho bien el ejercicio 3 es que hacias el 1 y el 2 fácil

            Ésto es un simulacro que no solo nos hace ver como hacer el reparto en aulas o como van los ordenadores,
            también os hace ver en que estado estais ahora mismo vosotros para enfrentaros a un examen final y también
            nos hace ver a Jorge y a mi que ejercicios necesitan mas especificación. Estad tranquilos que en el examen
            final el ejercicio lógico estará bien especificado y sin necesidad de sobreentender.
         */

        System.out.println("Has hecho bien el ejercicio 1, 2 y 4?");
        boolean b1 = sc.nextBoolean();
        System.out.println("Has intentado el ejercicio 3?");
        boolean b2 = sc.nextBoolean();
        System.out.println("Has hecho bien el ejercicio 3?");
        boolean b3 = sc.nextBoolean();
        System.out.println("Te has olvidado de los ejercicios 1 y 2?");
        boolean b4 = sc.nextBoolean();

        System.out.println("\nVas por buen camino: " + (b1&&!b2 || b3&&!b4));
    }
}

