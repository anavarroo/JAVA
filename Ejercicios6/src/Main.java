import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       /* 1. Leer dos números enteros e imprimir el mayor de ellos.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int n2 = sc.nextInt();

        if (n1>n2) {
            System.out.println("El numero mayor es " + n1);
        }
        else {
            System.out.println("El numero mayor es " + n2);
        }

        /*2. Leer un entero y comprobar si es negativo o positivo, imprimiendo por pantalla una
        frase al respecto. Considere el cero como positivo. */

        System.out.println("Introduce el entero: ");
        int entero = sc.nextInt();

        if(entero>=0){
            System.out.println("El numero es positivo");
        }
        else {
            System.out.println("El numero es negativo");
        }
        /* 3. Modifique el ejercicio anterior para que, en caso de introducir un cero, se imprima
        por pantalla un mensaje específico.*/

        System.out.println("Introduce el entero: ");
        int entero2 = sc.nextInt();

        if(entero2 == 0) {
            System.out.println("El numero es 0");
        }
        if (entero2<0) {
                System.out.println("El numero es negativo");
            }
        else {
            System.out.println("El numero es positivo");
        }


        /*4. Leer una edad y comprobar si la persona es mayor de edad, imprimiendo una frase
        al respecto. Si es menor, imprimir también un mensaje.*/

        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();

        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }

       /* 5. Modificar el ejercicio anterior para que además se compruebe si es jubilado (tiene
        más de 67años), imprimiendo un mensaje al respecto. */

        if (edad>67) {
            System.out.println("Y tambien eres jubilado");
        }

       /* 6. Modificar el ejercicio anterior para que solo se permita una edad válida (0 a 120). En
        caso de ser válida hará todo lo implementado anteriormente. En caso de ser
        inválida, se imprimirá un mensaje de error y el programa acabará. */
        System.out.println("Introduce la edad: ");
        int edad2 = sc.nextInt();
        if (0<edad2 && edad2<120) {

            if (edad2>=18){
                System.out.println("Eres mayor de edad");
            }
            else {
                System.out.println("Eres menor de edad");
            }

            if (edad2>67) {
                System.out.println("Y tambien eres jubilado");
            }
        }
        else {
            System.out.println("Edad no valida");
        }


      /*  7. Leer seis números y comprobar si coinciden con la combinación ganadora de la
        primitiva (1, 3, 10, 20, 33, 40), imprimiendo un mensaje al respecto. */

        System.out.println("Introduce el primer numero: ");
        int p1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int p2 = sc.nextInt();
        System.out.println("Introduce el tercero numero: ");
        int p3 = sc.nextInt();
        System.out.println("Introduce el cuarto numero: ");
        int p4 = sc.nextInt();
        System.out.println("Introduce el quinto numero: ");
        int p5 = sc.nextInt();
        System.out.println("Introduce el sexto numero: ");
        int p6 = sc.nextInt();

        if (1<=p1 && p1<=49 && 1<=p2 && p2<=49 && 1<=p3 && p3<=49 && 1<=p4 && p4<=49 && 1<=p5 && p5<=49 && 1<=p6 && p6<=49) {
            if (p1 == 1) {
                if (p2 == 3) {
                    if (p3 == 10) {
                        if (p4 == 20) {
                            if (p5 == 33) {
                                if (p6 == 40) {
                                    System.out.println("La combinacion es correcta");
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("La combinacion es incorrecta");
            }
        }
        else {
            System.out.println("Error");
        }

        /* 8. Modificar el ejercicio anterior para que, al leerlos, se compruebe si todos los
        números leídos tienen el rango apropiado (entre 1 y 49). Si no lo tienen, imprimir un
        mensaje de error y el programa acabará.
        Hecho en el 7
        */

       /* 9. Leer por pantalla un entero y comprobar si es par o impar (use el operador módulo
                %). */

        System.out.println("Introduce el numero: ");
        int par = sc.nextInt();

        if (par % 2 == 0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }

        if (par % 3 == 0){
            System.out.println("Es divisible");
        } else if (par % 3 == 1){
            System.out.println("Sobra 1");
        } else if (par % 3 == 2) {
            System.out.println("Sobra 2");
        }

        /* 10. Crear un programa que calcule el índice de masa corporal. Lea los datos que sean
        necesarios, imprima por pantalla el índice, y dependiendo de su valor imprima al
        usuario un mensaje informativo. Por ejemplo: está por debajo de lo normal, está
        normal o está por encima de lo normal. */

        System.out.println("Introduce la altura en cm: ");
        float altura= sc.nextFloat();
        System.out.println("Introduce el peso en kg: ");
        float peso = sc.nextFloat();

        float imc= peso / (altura*altura);

        if (imc < 18.5){
        } else if (imc <=24.9) {
            System.out.println("Muy delgado");
        } else if (imc <=29.9) {
            System.out.println("Bien");
        } else if (imc > 29.9){
            System.out.println("Sobrepeso");
        }


      /*  11. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes
        correspondiente. En caso de leer un número fuera de rango, imprimir por pantalla un
        mensaje de error. */

       /* 12. Establezca un número entre 0 y 9999, que servirá como contraseña. Puede elegir el
        que desee. Pida por pantalla un número y si coincide escriba “Contraseña correcta,
        accediendo al sistema”, en caso contrario escriba “Contraseña incorrecta, cerrando
        sesión”.  */

        System.out.println("Introduce el numero: ");
        int contraseña = sc.nextInt();

        int contra=4444;
        if (contraseña==contra){
            System.out.println("Contraseña correcta");

        }
        else {
            System.out.println("Contraseña incorrecta");
        }

       /* 13. Desarrolle un sistema de cálculo de descuentos para una farmacia. Cuando el
        usuario introduzca un precio, usted deberá aplicar un descuento del 15% a ese
        valor, e imprimir por pantalla el precio final. Recuerde que debe imprimir el precio
        final tras aplicar el descuento, no la cantidad que se descuenta. */
        System.out.println("Introduce el precio del articulo: ");
        float precio = sc.nextFloat();

        System.out.println("El precio final es: " + precio*0.85f);

       /* 14. Modifique el anterior para que además se imprima la cantidad que se descuenta. */
        System.out.println("Descuente aplicado: " + precio*0.15f);


      /*  15. Diseñe un programa que lea la temperatura en centígrados del día e imprima el tipo
        de clima de acuerdo a la siguiente tabla.*/

        System.out.println("Introduce la temperatura actual: ");
        float temp = sc.nextFloat();

        if (temp <= 10){
            System.out.println("Hace frio");
        } else if (temp > 10 && temp <= 20){
            System.out.println("Nublado");
        } else if (temp > 20 && temp <= 30){
            System.out.println("Caluroso");
        } else {
            System.out.println("Tropical");
        }
        /*16. Pedir un número entre 0 y 99999 y decir cuántas cifras tiene. */

        System.out.println("Intrduce el numero: ");
        int numerico = sc.nextInt();

        if (0<=numerico && numerico<10){
            System.out.println("El numero tiene 1 cifras");
        } else if (numerico>=10 && numerico <=99 ) {
            System.out.println("El numero tiene 2 cifras");
        } else if (numerico>=100 && numerico <=999 ) {
            System.out.println("El numero tiene 3 cifras");
        } else if (numerico>=1000 && numerico <=9999 ) {
            System.out.println("El numero tiene 4 cifras");
        } else if (numerico>=10000 && numerico <=99999 ) {
            System.out.println("El numero tiene 5 cifras");
        }
        else {
            System.out.println("Numero fuera de rango");
        }

       /* 17. La universidad ha categorizado las matrículas de acuerdo a la facultad que va a
        estudiar el postulante. Ingrese por teclado el nombre de la facultad donde va a
        estudiar, y muestre el importe y la mensualidad. (Use el control switch-case, y
                recuerde que el nombre que introduzca debe coincidir exactamente con el nombre
        de universidad). */

        System.out.println("Introduce el nombre de la facultad ");
        String nombre = sc.nextLine();

        switch(nombre) {
            case "Ing. de Sistemas":
                System.out.println("El importe es 350 y la mensualidad 650");
                break;
            case "Derecho":
                System.out.println("El importe es 300 y la mensualidad 550");
                break;
            case "Ing. Naviera":
                System.out.println("El importe es 300 y la mensualidad 500");
                break;
            case "Ing. Pesquera":
                System.out.println("El importe es 310 y la mensualidad 460");
                break;
            case "Contabilidad":
                System.out.println("El importe es 280 y la mensualidad 490");
                break;
            case "Administracion":
                System.out.println("El importe es 360 y la mensualidad 520");
                break;

            default:
                System.out.println("Facultad no valida");
                break;
        }

        System.out.println("FIN");


        /*18. Escriba programa para ingresar 4 notas de un alumno, calcular y mostrar su
        promedio, sabiendo que la primera y segunda tiene 20% de peso cada una, la
        tercera y cuarta tienen 30% de peso cada una. */

        System.out.println("Introduce la primera nota: ");
        int nota1=sc.nextInt();
        System.out.println("Introduce la segunda nota: ");
        int nota2=sc.nextInt();
        System.out.println("Introduce la tercera nota: ");
        int nota3=sc.nextInt();
        System.out.println("Introduce la cuarta nota: ");
        int nota4=sc.nextInt();

        System.out.println("El promedio es " + ((nota1*0.2)+(nota2*0.2)+(nota3*0.3)+(nota4*0.3))/4);


        /*19. Desarrolle un programa que pida cuantos hombres y mujeres hay en un aula y
        permita calcular el porcentaje de hombres y mujeres. */

        System.out.println("Numero de hombres: ");
        int nH = sc.nextInt();
        System.out.println("Numero de mujeres: ");
        int nM = sc.nextInt();

        float total = nH+nM;
        float pH = nH/total*100;

        System.out.println("Porcetaje de hombres: " + pH);
        System.out.println("Porcetaje de mujeres: "  + (100-pH));

        /*20. A partir de aquí, los ejercicios son complicados. No se frustre si no le salen.
         21. Leer por pantalla dos números enteros, e imprimirlos por pantalla en orden creciente.
        22. Leer por pantalla tres números enteros, e imprimirlos por pantalla en orden
        creciente.
        23. Repetir el ejercicio anterior, e imprimirlos en orden decreciente.
        24. Lea un número por pantalla y determine si es múltiplo de 10 (use el operador
        módulo).

        25. Leer por pantalla un número de tres cifras, e imprimir cada una de sus cifras en una
        línea.
        26. Crea una aplicación llamada CalculadoraInversa, que lea por pantalla dos operandos
                (String) y un signo aritmético (String), y según este último se realizará la operación
        correspondiente. Al final mostrará el resultado en consola. Los signos aritméticos
        disponibles son:
        +: suma los dos operandos.
        -: resta los operandos.
                *: multiplica los operandos.
                /: divide los operandos, este debe dar un resultado con decimales (double)
%: módulo, resto de la división entre operando1 y operando2.
                Para leer por pantalla usar únicamente nextLine.
        27. En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje
        obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes
        resultados:
        Si los tres dados son seis, mostrar el mensaje “Muy buena suerte”
        Si dos dados son seis, mostrar el mensaje “Buena suerte”
        Si un dado es seis, mostrar el mensaje “Mala Suerte”
        Si ningún dado se obtiene seis, mostrar el mensaje “Muy mala suerte”
        Simule los lanzamientos con tres números aleatorios, usando instrucciones Java que
        los genere. */

    }
}
