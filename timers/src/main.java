import java.util.Scanner;


public class main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los minutos: ");
        int n = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int n1 = sc.nextInt();


        if (n >= 0 && n <= 59 && n1 >= 0 && n1 <= 59) {

            for (int i = n; i >= 0; i--) {
                for (int j = n1; j>= 0; j--) {

                    if (j>=0 && j<10){

                        System.out.println(i + ":0" + j);
                        Thread.sleep(1000);

                        /* System.out.print ("\r" + i + ":0" + j); */


                    } else {

                        System.out.println(i + ":" + j);

                       /* El caracter \r sirve para que se imprima todo en una misma linea,
                       suprime el out del print anterior y lo reemplaza por el siguiente. Hace que el
                       out se vea de una forma mas "limpia";

                       System.out.print ("\r" + i + ":" + j);  */

                        Thread.sleep(1000);
                        /* La funcion de Thread.sleep(1000); es retrasar el out
                        del println de la variable i, en vez de hacer que sea instantaneo,
                        lo retrasa la cantidad de tiempo que se encuentra entre
                        los (), en este caso 1000 milisegundos. */
                    }

                }
                n1=59;
            }

            System.out.println("FIN");
        }

        else {
            System.out.println("Has introducido un numero fuera de rango.");
        }


    }
}

