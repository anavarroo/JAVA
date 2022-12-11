import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Ejercicio 1");
        System.out.println("Introduce el numero: ");
        int n1 = sc.nextInt();

        if (n1>0){
            for (int i=0;i<=n1;i++){
                System.out.println(i);
            }
        } else {
            System.out.println("ERROR");
        }


        System.out.println("Ejercicio 2");
        System.out.println("Introduce el numero:  ");
        int numero6 = sc.nextInt();

        if (numero6>0){
            for (int i = 1; i<=numero6; i++) {
                if (i%2==0){
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Numero menor que 0 introducido");
        }


        System.out.println("Ejercicio 3");
        System.out.println("Introduce el numero:  ");
        int n3 = sc.nextInt();

        if (n3>0){
            for (int i = 1; i<=n3; i++) {
                if (i%2!=0){
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Numero menor que 0 introducido");
        }

        System.out.println("Ejercicio 4");
        System.out.println("Introduce un numero: ");
        int n4 = sc.nextInt();

        for (int i=0;i<n4;i++){
            System.out.println(3*i+2);
        }


        System.out.println("Ejercicio 5");
        System.out.println("Introduce cuantos numeros de la sucesion quieres que saque por pantalla: ");
        int n5 = sc.nextInt();
        int suce = 1;
        for (int i=0;i<=n5;i++){
            suce = suce*2;
            System.out.println(suce);
        }

        System.out.println("Ejercicio 6");
        System.out.println("Introduce cuantos numeros de la sucesion quieres que saque por pantalla: ");
        int n6 = sc.nextInt();
        int suce1 = 1;
        for (int i=0;i<n6;i++){
            suce1 = suce1+7;
            System.out.println(suce1);
        }



        System.out.println("Ejercicio 5.2");
        System.out.println("Introduce cuantos numeros de la sucesion quieres que saque por pantalla: ");
        int n7 = sc.nextInt();
        int suce2 = 1;
        int suma = 0;
        for (int i=0;i<=n7;i++){
            suce2 = suce2*2;
            suma +=suce2;
        }
        System.out.println("Suma de la sucesion: " + suma);


        System.out.println("Ejercicio 6.2");
        System.out.println("Introduce cuantos numeros de la sucesion quieres que saque por pantalla: ");
        int n8 = sc.nextInt();
        int suce3 = 1;
        int suma2=0;
        for (int i=0;i<n8;i++){
            suce3 = suce3+7;
            suma2+=suce3;
        }
        System.out.println("Sumatorio de la sucesion " + suma2);

    }

}
