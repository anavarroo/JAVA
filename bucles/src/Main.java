import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 9");
        System.out.println("Introduce el numero: ");

        int numero1 = sc.nextInt();
        int par = numero1 / 2;

        for (int i = 0; i < numero1; i++) {
            if (numero1 % 2 != 0) {
                if (i == numero1) {
                    System.out.print("0");
                } else {
                    System.out.println("1");
                }

            }

            for (int j = 0; j < numero1 - 1; j++) {
                System.out.print("0");

            }
            System.out.println();


        }

        /* 4 */
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        for (int i = 1; i < numero; i++) {
            System.out.print("0");
        }


        System.out.println();
        System.out.println("Ejercicio 5");
        for (int i = 1; i < numero; i++) {
            System.out.print("0");

        }


        System.out.println();
        System.out.println("Ejercicio 6");

        for (int i = 1; i < numero; i++) {
            System.out.print("0");
        }
        System.out.print("1");


        System.out.println();
        System.out.println("Ejercicio 7");

        for (int i = 0; i < numero; i++) {
            System.out.print("0");
            if (i / 2 == numero) {
                System.out.println("1");
            }

        }
        System.out.println();
        System.out.println();


        System.out.println("Ejercicio 8");

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.print("0");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 9");

        for (int i = 0; i < numero; i++) {

            for (int j = 0; j < numero; j++) {
                if (i == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 10");

        for (int i = 0; i < numero; i++) {
            System.out.print("1");
            for (int j = 0; j < numero - 1; j++) {
                System.out.print("0");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Ejercicio 11");

        for (int i = 0; i < numero; i++) {

            for (int j = 0; j < numero; j++) {
                if (i == 2) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Ejercicio 12");

        for (int i = 0; i < numero; i++) {

            for (int j = 0; j < numero - 1; j++) {
                System.out.print("0");
            }
            System.out.println("1");
        }


        System.out.println();
        System.out.println("Ejercicio 13");

        for (int i = 0; i < numero; i++) {

            for (int j = 0; j < numero; j++) {
                if (i == 0) {
                    System.out.print("1");
                } else if (j == 0) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 14");

        for (int i = 0; i < numero; i++) {

            for (int j = 0; j < numero; j++) {
                if (i == 2) {
                    System.out.print("1");
                } else if (j == 2) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 15");

        for (int i = 0; i < numero; i++) {

            for (int j = 0; j < numero; j++) {
                if (i % 2 == 0) {
                    System.out.print("1");
                } else if (j % 2 == 0) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 16");

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {

                if (i == j) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 17");

        System.out.println("Introduce el numero de filas: ");
        int filas = sc.nextInt();
        System.out.println("Introduce el numero de columnas: ");
        int columnas = sc.nextInt();
        int cont = 0;

        for (int i = 0; i < filas; i++) {
            System.out.println();

            for (int j = 0; j < columnas; j++) {
                System.out.print(0);
                cont++;
            }

        }
        System.out.println();
        System.out.println();


        System.out.println("Ejercicio 18");


        System.out.println("Introduce el numero de filas: ");
        int filas1 = sc.nextInt();
        System.out.println("Introduce el numero de columnas: ");
        int columnas1 = sc.nextInt();
        int cont1 = 0;

        for (int i = 0; i < filas1; i++) {
            System.out.println();

            for (int j = 0; j < columnas1; j++) {
                System.out.print(cont1 + 1);
                cont1++;
            }

        }

        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 19");

        System.out.println("Introduce el numero:  ");
        int numero2 = sc.nextInt();

        for (int i = 0; i < 7; i++) {
            System.out.println(numero2);
        }


        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 20");

        System.out.println("Introduce el numero:  ");
        int numero3 = sc.nextInt();

        for (int i = 0; i < numero3; i++) {
            System.out.println(numero3);
        }


        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 21");

        System.out.println("Introduce el numero:  ");
        int numero4 = sc.nextInt();
        System.out.println("Introduce la letra:  ");
        String letra = sc.next();

        for (int i = 0; i < numero4; i++) {
            System.out.println(letra);
        }


        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 22");

        System.out.println("Introduce el numero:  ");
        int numero5 = sc.nextInt();

        for (int i = 0; i < numero5; i++) {
            System.out.println(i);
        }


        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 23");

        for (int i = 0; i < numero5; i++) {
            System.out.print(i);
        }


        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 24");
        System.out.println("Introduce el numero:  ");
        int numero6 = sc.nextInt();
        int z = 2;

        for (int i = 0; i < numero6; i++) {
            System.out.println(z);
            z+=2;
        }


        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 25");
        System.out.println("Introduce el numero:  ");
        int numero7 = sc.nextInt();
        int x = 2;

        for (int i = 0; i < numero7; i++) {

            System.out.println(x-1);
            x+=2;

        }
    }
}
