import java.util.Scanner;

public class Albertonavarrovega {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        /* Ejercicio 1 */

        /* Mujer= 1    Hombre=2 */

        System.out.println("Mujer=1 , Hombre=2");
        System.out.println("Introduce el genero: ");
        int g = sc.nextInt();

        if (g != 2) {
            System.out.println("Ha elegido el genero mujer");

            System.out.println("Ahora debe elegir la clase");
            System.out.println("1 Clase Asesina, 2 Clase Druida, 3 Clase Amazona");
            System.out.println("¿Cual seleccionas?: ");
            int c = sc.nextInt();
            if (c == 1) {
                System.out.println("Has elegido la clase Asesina");
            }
            if (c == 2) {
                System.out.println("Has elegido la clase Druida");
            }
            if (c == 3) {
                System.out.println("Has elegido la clase Amazona");
            }
            if (c != 1 && c != 2 && c != 3) {
                System.out.println("Has elegido la clase Asesina");
            }
        } else if (g == 2) {
            System.out.println("Ha elegido el genero hombre");

            System.out.println("Ahora debe elegir la clase");
            System.out.println("1 Clase Buscavidas, 2 Clase Guerrero, 3 Clase Mago");
            System.out.println("¿Cual seleccionas?: ");
            int c = sc.nextInt();
            if (c == 1) {
                System.out.println("Has elegido la clase Buscavidas");
            }
            if (c == 2) {
                System.out.println("Has elegido la clase Guerrero");
            }
            if (c == 3) {
                System.out.println("Has elegido la clase Mago");
            }
            if (c != 1 && c != 2 && c != 3) {
                System.out.println("Has elegido la clase Buscaidas");
            }

        }



        /* Ejercicio 2 */
        /*
        do {
        System.out.println("Introduce un numero ");
        int n1 = sc.nextInt();

                switch (n1) {
                    case 0:
                        System.out.println("Examen finalizado con exito!");
                        break;

                    case 1:
                        System.out.println("Ejercicio 1 finalizado");
                        break;
                    case 2:
                        System.out.println("Ejercicio 2 finalizado");
                        break;

                    case 3:
                        System.out.println("Ejercicio 3 finalizado");
                        break;

                    case 4:
                        System.out.println("Ejercicio 4 finalizado");
                        break;

                    default:
                        System.out.println("Numero fuera de rango");
                        break;

                }

        } while (true);


         */

        /* Ejercicio 2 */

                for (int i=0;i>-1;i++) {
            System.out.println("Introduce un numero ");
            int n1 = sc.nextInt();

            if (n1==0){
                System.out.println("Examen finalizado con exito");
                break;
            } else if (n1==1){
                System.out.println("Ejercicio 1 finalizado con exito");
            } else if (n1==2){
                System.out.println("Ejercicio 2 finalizado con exito");
            } else if (n1==3){
                System.out.println("Ejercicio 3 finalizado con exito");
            } else if (n1==4){
                System.out.println("Ejercicio 4 finalizado con exito");
            } else if (n1!=1 && n1!=2 && n1!=3 && n1!=4){
                System.out.println("Error, numero fuera de rango");
            }

        }


        /* Ejercicio 3 */

        System.out.println("Introduce un numero: ");
        int n = sc.nextInt();

        String rojo = "\033[0;31m";
        String amarillo = "\033[0;33m";
        String reset = "\033[0m";

        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if (j==i ||j==0){
                    System.out.print(rojo + "*" + reset);

                } else if (j!=i){
                    System.out.print(amarillo + "*" + reset);
                }

            }
            System.out.println();
        }

        for (int i=n;i>=0;i--){
            for(int j=0;j<i+1;j++){
                if (j==i ||j==0){
                    System.out.print(rojo + "*" + reset);
                } else if (j!=i){
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();
        }




        /* Ejercicio 4 */

        System.out.println("Introduce TRUE/FALSE");
        System.out.println ("¿Has hecho bien el ejercicio 1, 2 y 4?: ");
        boolean t1 = sc.nextBoolean();
        System.out.println ("¿Has intentado el ejercicio 3?");
        boolean t2 = sc.nextBoolean();
        System.out.println ("¿Has hecho bien el ejercicio 3?");
        boolean t3 = sc.nextBoolean();
        System.out.println ("¿Te has olvidado de los ejercicios 1 y 2?");
        boolean t4 = sc.nextBoolean();

        if (t1 && !t2 || t3 && !t4){
            System.out.println("Eres una persona un poco razonable");
        }
        else {
            System.out.println("Estas loco");
        }



    }
}
