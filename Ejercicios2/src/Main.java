public class Main {
    public static void main(String[] args) {
       /*  1. Crear una variable entera e imprimirla por pantalla sin asignarle ningún valor.
        ¿Qué se ha impreso? */

       /* int x;

        System.out.println(x);

        */

      /*  2. Crear una variable entera con el valor 0. Incrementar su valor en 3 unidades utilizando el operador
        de suma + y asignación =, e imprimirla por pantalla. */

        int y=0;
        y +=3;
        System.out.println(y);
      /*  2. Decrementar su valor en una unidad utilizando el operador de decremento --. Imprimirla por pantalla. */
        System.out.println(--y);

       /* 3. Incrementar su valor en 4 unidades sin utilizar el operador de suma + y asignación =, e imprimirla por pantalla. */
        System.out.println(++y);
        System.out.println(++y);
        System.out.println(++y);
        System.out.println(++y);

       /* 4. Crear otra variable entera y asignarle el valor 48.76. */
        float a= 48.76f;


       /* 5. Modificarla dividiendo por 50 e imprimir el resultado por pantalla. */

        a=a/50;
        System.out.println(a);

       /* 6. Modificarla sumándole 1 y multiplicando por 48 e imprimir el resto de dividirla entre 46. */
        float b= ((a+1)*48%46);
        System.out.println((a+1)*48%46);

       /* 7. Sin modificar el valor de la variable, imprimir por pantalla el resultado de elevarla al cuadrado. */

        System.out.println(b*b);

       /* 8. Crear dos variables de tipo float, dándoles un valor inicial e imprimiéndolas por pantalla. */

        float c = 2.56f;
        float d = 9.11f;

        System.out.println(c);
        System.out.println(d);

       /* Los siguientes ejercicios quedarán más claros conforme avancemos en el temario,
                no se preocupe si no sabe hacerlos o no los entiende: */

       /* 9. Imprimir por pantalla el resultado de comprobar si la primera es mayor que la segunda. */

        System.out.println(c>d);

        if(c>d) {

            System.out.println("La primera es mayor que la segunda");

        }
        else {

            System.out.println("La segunda es menor que la primera");
        }


       /* 10. Cambiar la primera con el valor de la segunda multiplicado por dos, y volver a imprimir por pantalla
        el resultado de la comprobación anterior. */

        d=d*2;
        System.out.println(c<d);

      /*  11. Imprimir por pantalla el resultado de comprobar si la primera es menor o igual que la segunda. */
        System.out.println(c<=d);

        /* 12. Repetir el ejercicio anterior pero almacenando el resultado de la comprobación
        en una variable, e imprimiendo después por pantalla dicha variable. */
        boolean resultado =c<=d;
        System.out.println(resultado);
        }
    }

