import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ejercicio 1");
        System.out.println("Introduce el nombre: ");
        String nombre = sc.next();

        for (int i = 0; i < 10; i++) {
            System.out.println("Hola " + nombre);
        }


        System.out.println("Ejercicio 2");
        System.out.println("Introduce el numero: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println("ERROR");
        }


        System.out.println("Ejercicio 3");
        String x = "Contraseña";

        for (int i = 0; i > -1; i++) {
            System.out.println("Introduce la contraseña: ");
            String y = sc.next();

            if (y.equals(x)) {
                System.out.println("Contraseña correcta");
                break;
            } else {
                System.out.println("Incorrecta");
            }
        }


        System.out.println("Ejercicio 4");

        int contador = 0;

        for (int i = 0; i > -1; i++) {
            System.out.println("Introduce el numero: ");
            int numero2 = sc.nextInt();

            if (numero2 < 0) {
                System.out.println("Numero negativo");
                break;
            } else if (numero2 > 0) {
                System.out.println("Numero positivo");
                break;
            } else if (numero2 == 0) {
                System.out.println("Numero 0 introducido continue.");
                contador++;
            }
        }
        System.out.println("Cantidad de numeros incorrectos introducido: " + contador);


        System.out.println("Ejercicio 5");

        int contador1 = 0;
        for (int i = 0; i > -1; i++) {
            System.out.println("Introduce el numero: ");
            int numero3 = sc.nextInt();


            if (numero3 > 0 && numero3 % 2 == 0) {
                System.out.println("Numero par");

                break;
            } else if (numero3 > 0 && numero3 % 2 != 0) {
                System.out.println("Numero inpar");

                break;
            } else if (numero3 < 0 || numero == 0) {
                System.out.println("Numero 0 o numero negativo introducido.");
                contador1++;
            }
        }
        System.out.println("Cantidad de numeros incorrectos introducidos: " + contador1);


        System.out.println("Ejercicio 7");
        System.out.println("Introduce un numero: ");
        int numero4 = sc.nextInt();


        do {

            switch (numero4) {

                case 1:
                    System.out.println("Corresponde a Enero");
                    break;
                case 2:
                    System.out.println("Corresponde a Febrero");
                    break;
                case 3:
                    System.out.println("Corresponde a Marzo");
                    break;
                case 4:
                    System.out.println("Corresponde a Abril");
                    break;
                case 5:
                    System.out.println("Corresponde a Mayo");
                    break;
                case 6:
                    System.out.println("Corresponde a Junio");
                    break;
                case 7:
                    System.out.println("Corresponde a Julio");
                    break;
                case 8:
                    System.out.println("Corresponde a Agosto");
                    break;
                case 9:
                    System.out.println("Corresponde a Septiembre");
                    break;
                case 10:
                    System.out.println("Corresponde a Octubre");
                    break;
                case 11:
                    System.out.println("Corresponde a Noviembre");
                    break;
                case 12:
                    System.out.println("Corresponde a Diciembre");
                    break;

                }
            } while (1<=numero4 && numero4<=12);


        System.out.println("Ejercicio 8");

        System.out.println("Introduce el entero");
        int entero = sc.nextInt();
        int pont =0;
        for (int i=0;i<5;i++){
            pont = pont + (entero*entero);
        }

        System.out.println("Entero " +pont);




        System.out.println("Ejercicio 12");
        System.out.println("Altura: ");
        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                if(i==0 || j==0 || i == n2-1 || j==n2-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


        System.out.println("Ejercicio 13");

        System.out.println("Introduce el entero");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Ejercicio 14");

        System.out.println("Introduce el entero");
        int n1 = sc.nextInt();
        System.out.println();


        for(int altura = 1; altura<=n1; altura++){

            for(int blancos = 1; blancos<=n-altura; blancos++){
                System.out.print(" ");
            }

            for(int asteriscos = 1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("Ejercicio 15");
        System.out.println("Introduce altura: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * (n - 1 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }





    }


    }



