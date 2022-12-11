import java.util.Scanner;

public class Timmy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean fin=false;

        int iPos=1;
        int jPos=1;

        System.out.println("Este es el terreno de Jimmy");

        for (int c=0;c>-1;c++){

        for (int i = 0;i<20;i++){
            for (int j = 0;j<20;j++){
                if (i == 0  || j== 0 || i == 19 || j == 19){
                    System.out.print("*");
                } else if (i==18 && j==18){
                    System.out.print("H");
                } else if (i==jPos && j==iPos){
                    System.out.print("T");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

            if (jPos==18 && iPos == 18){
            fin=true;
                if (fin) {
                    System.out.println("Timmy llego a casa!");
                    break;
                    }
                } else if (iPos<=0 ||jPos<= 0 || iPos>=19 ||jPos >= 19){
                System.out.println("Timmy se ha chocado con un obstaculo!");
                break;
                }

            System.out.println("Siguiente paso (N=Arriba, S=Abajo, E=Derecha, O=Izquierda, STOP=Parar el programa.) : ");
            String respuesta = sc.next();


                if (respuesta.equals("N")){
                    iPos=iPos;
                    jPos=jPos-1;
                    System.out.println("Timmy se encuentra en (" +iPos + "," + jPos +")");

                } else if (respuesta.equals("S")){
                    iPos=iPos;
                    jPos=jPos+1;
                    System.out.println("Timmy se encuentra en (" +iPos + "," + jPos +")");

                } else if (respuesta.equals("E")){
                    iPos=iPos+1;
                    jPos=jPos;
                    System.out.println("Timmy se encuentra en (" +iPos + "," + jPos +")");

                } else if (respuesta.equals("O")){
                    iPos=iPos-1;
                    jPos=jPos;
                    System.out.println("Timmy se encuentra en (" +iPos + "," + jPos +")");

                } else if (respuesta.equals("STOP")){
                    System.out.println("Programa terminado");
                    break;
                }

            }


    }

}



