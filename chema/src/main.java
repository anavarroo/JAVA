import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        long startTime, endTime;    //variables para inicio y fin de contador de tiempo
        startTime = System.nanoTime();  //inicio del contador de tiempo que tarda un programa.
        int contador = 0;
        int record = 0;

        // Mensaje de Bienvenida
        System.out.println("BIENVENIDO AL JUEGO - MATH TRAINING");  // "\033[0;1m" -- SIRVE PARA PONER TEXTO EN NEGRITA
        System.out.println();
        // Pregunta jugar o no
        String pregunta="Si";

        do {
            System.out.print("Quieres empezar el juego?: ");
            pregunta = sc.next();
            if (!pregunta.equals("Si") && !pregunta.equals("si") && !pregunta.equals("SI")){
                System.out.println("No quiere jugar");

            } else {
                System.out.println("READY....3....2....1....GO");
                int num1;
                int num2;
                int operacion;

                for (int i=0; i>-1; i++){
                    num1 = (int) (Math.random() * 101);
                    num2 = (int) (Math.random() * 101);
                    operacion = (int) (Math.random() * 5);
                    if (operacion == 0){
                        System.out.println(num1 + " + " + num2);
                        System.out.println("Cual es el resultado: ");
                        int resultado = sc.nextInt();
                        if (resultado == (num1 + num2)) {
                            System.out.println("Respuesta acertada");
                            contador++;
                        } else {

                            if (contador>record){
                                record = contador;
                                System.out.println("El record de la sesion ha sido " + record);
                            } else {
                                contador = contador;
                            }

                            System.out.println("Has lleado a " + contador + " intentos");
                            System.out.println("Respuesta fallida");
                            contador++;break;
                        }
                    } else if (operacion == 1){
                        System.out.println(num1 + " - " + num2);
                        System.out.println("Cual es el resultado: ");
                        int resultado = sc.nextInt();
                        if (resultado == (num1 - num2)) {
                            System.out.println("Respuesta acertada");
                            contador++;
                        } else {

                            if (contador>record){
                                record = contador;
                                System.out.println("El record de la sesion ha sido " + record);
                            } else {
                                contador = contador;
                            }

                            System.out.println("Has lleado a " + contador + " intentos");
                            System.out.println("Respuesta fallida");

                            contador++;break;
                        }
                    } else if (operacion == 2){
                        System.out.println(num1 + " * " + num2);
                        System.out.println("Cual es el resultado: ");
                        int resultado = sc.nextInt();
                        if (resultado == (num1 * num2)) {
                            System.out.println("Respuesta acertada");
                            contador++;
                        } else {
                            if (contador>record){
                                record = contador;
                                System.out.println("El record de la sesion ha sido " + record);
                            } else {
                                contador = contador;
                            }

                            System.out.println("Has lleado a " + contador + " intentos");
                            System.out.println("Respuesta fallida");

                            contador++;break;
                        }
                    } else if (operacion == 3){
                        System.out.println(num1 + " / " + num2);
                        System.out.println("Cual es el resultado: ");
                        int resultado = sc.nextInt();
                        if (resultado == (num1 / num2)) {
                            System.out.println("Respuesta acertada");
                            contador++;
                        } else {
                            if (contador>record){
                                record = contador;
                                System.out.println("El record de la sesion ha sido " + record);
                            } else {
                                contador = contador;
                            }

                            System.out.println("Has lleado a " + contador + " intentos");
                            System.out.println("Respuesta fallida");

                            contador++;break;
                        }
                    } else if (operacion == 4) {
                        System.out.println(num1 + " % " + num2);
                        System.out.println("Cual es el resultado: ");
                        int resultado = sc.nextInt();
                        if (resultado == (num1 % num2)) {
                            System.out.println("Respuesta acertada");
                            contador++;
                        } else {
                            if (contador>record){
                                record = contador;
                                System.out.println("El record de la sesion ha sido " + record);
                            } else {
                                contador = contador;
                            }

                            System.out.println("Has lleado a " + contador + " intentos");
                            System.out.println("Respuesta fallida");
                            contador++;break;
                        }
                    }
                }
            }
        } while (pregunta.equals("Si") || pregunta.equals("si") || pregunta.equals("SI"));


        System.out.println();
        endTime = System.nanoTime();    //final del contador de tiempo que tarda un programa.

        System.out.println("Tiempo: " + (endTime - startTime) / 1000000000 + " segundos");/*Si queremos pasar los Nanosegundos
                                                                                            a segundos basta con dividir
                                                                                            entre 1000000000*/


    }
}
