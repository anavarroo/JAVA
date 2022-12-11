import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*   EJERCICIO 1
        1. Crea una variable de tipo entero y asígnale el valor 10.
        2. Imprímela por pantalla.
        3. Decrementa su valor una vez.
        4. Imprímela por pantalla.
        5. Multiplícalo por dos.
        6. Réstale cuatro unidades.
        7. Imprímela por pantalla.
        8. Incrementa su valor cuatro veces usando el operador de incremento (++).
        9. Imprímela por pantalla.
        10. Crea una segunda variable y asígnale el resultado de sumar una unidad a la primera.
        11. Imprime las dos variables.
        12. Divide la segunda entre dos.
        13. Imprime las dos variables y comprueba si el resultado es el correcto comparando con otros
        compañeros. */

        int x=10;

        System.out.println(x);

        --x;

        System.out.println(x);

        x=x*2;
        x=x-4;

        System.out.println(x);

        ++x;
        ++x;
        ++x;
        ++x;

        System.out.println(x);

        int y=x+1;

        System.out.println(y);
        System.out.println(x);

        y= y/2;

        System.out.println(y);

            /*    EJERCICIO 2
        Desarrollar un algoritmo para calcular el área de un rectángulo, cuya fórmula es base x altura.
                Para ello:
        1. Cree una variable para almacenar el valor de la base, y asigne un valor.
        2. Cree una variable para almacenar el valor de la altura, y asigne un valor.
        3. Cree una variable para almacenar el área, y utilice la fórmula anterior para asignarle el valor
        adecuado.
        4. Imprima por pantalla el área, utilizando una instrucción println.
        5. Tenga en cuenta que debe elegir el tipo adecuado para cada variable. */

        int base=2;
        int altura=4;
        float area;

        area=base*altura;
        System.out.println(area);

        /* EJERCICIO 3
        Desarrollar un algoritmo para convertir de euros a dólares teniendo en cuenta que un euro son
        1.16 dólares. Para ello:
        1. Cree una variable para almacenar el factor de conversión (1.16).
        2. Cree una variable para almacenar la cantidad de euros (no asigne ningún valor aún).
        3. Utilice una instrucción de asignación para darle un valor a la variable anterior.
        4. Cree una variable para almacenar la cantidad de dólares, y asigne el resultado de multiplicar
        el factor de conversión por la cantidad de euros.
        5. Imprima por pantalla el resultado, utilizando una instrucción println. */

        float d=1.16f;
        float euros;
        float dolares;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los euros: ");
        euros = sc.nextFloat();



        System.out.println("Tienes un total de: ");
        System.out.println(d*euros +" dolares");


              /*  EJERCICIO 4
        Modifique el ejercicio 2 para ahorrarnos la creación de la variable del área. Para ello:
        elimine dicha variable, y ponga en la instrucción println la fórmula del área directamente. */


        System.out.println(base*altura);

       /* EJERCICIO 5
        Modifique el ejercicio 3 para ahorrarnos la creación de la variable del factor de conversión.*/

        dolares=d*euros;
        System.out.println("Tienes un total de: ");
        System.out.println(dolares +" dolares");


              /*  EJERCICIO 6
        1. Cree una variable de tipo entero y asigne el valor 3.
        2. Decremente su valor tres veces con el operador de decremento (- -).
        3. Incremente su valor 6 unidades con el operador de suma simplificada (+=).
        4. Incremente su valor en una unidad utilizando el operador de incremento (++).
        5. Duplique su valor como desee.
        6. Utilice el operador módulo (%) para comprobar el resto de dividir la variable entre 2,
                imprimiendo por pantalla el resultado.
        7. ¿Cómo se puede comprobar si un número es par o impar?

               */

        int p=3;
        --p;
        --p;
        --p;

        p+=6;

        ++p;

        p=p*2;

        System.out.println(p%2);

        /* Si el resto es 0 el numero es par. */
    }
}
