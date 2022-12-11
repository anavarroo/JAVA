import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Impresion con formato de un numero/cadena
        System.out.printf("%d\n",30);
        System.out.printf("%f\n",40.6f);
        System.out.printf("%f\n", 2.98);
        System.out.printf("%s\n", "Holi");

        // Impresion con formato de varios numeros/cadenas
        int edad=38, peso=75;
        float altura=1.8f;
        System.out.println("El usuario tiene " + edad + " anyos de edad y mide " + altura + " metros");
        System.out.printf("El usuario tiene %d anyos de edad y mide %f metros\n", edad, altura);
        System.out.printf("El usuario tiene %d anyos de edad, pesa %d kilos y mide %f metros\n", edad, peso, altura);

        // Impresion con formato para imprimir enteros con anchura determinada
        System.out.printf("%02d\n",3); // Imprimimos 3 con anchura 2, rellenando con ceros
        System.out.printf("%05d\n",3); // Imprimimos 3 con anchura 5, rellenando con ceros
        System.out.printf("%05d\n",3000000); // Imprimimos 3 con anchura 5, rellenando con ceros

        //System.out.printf("%*5d\n",3);// Imprimimos 3 con anchura 5, rellenando con asteriscos (no se puede así)
        int minutos=5, segundos=4; // 05:04
        System.out.printf("%02d:%02d\n", minutos, segundos);
        System.out.printf("%.2f\n",3.897654);
        System.out.printf("%.4f\n",3.897654);



        System.out.println("\n\n\na"); //3 saltos + el println
        System.out.println("hola\thola"); // espacio entre los hola
        System.out.println(" ' ");
        System.out.println(" \" " ); // una comilla
        System.out.println("\\"); // una barra
        System.out.println("Hola\rm"); //si pongo un caracter delante del /r sale
        // ese caracter sino pone nada saldria el hola

    }
}
