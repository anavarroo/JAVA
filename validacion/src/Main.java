import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrduce SOLO el numero del DNI sin la letra: ");
        int numDni = sc.nextInt();

        int letra = numDni % 23;


        switch (letra) {
            case 0:
                System.out.println("Tu letra es la T");
                break;
            case 1:
                System.out.println("Tu letra es la R");
                break;
            case 2:
                System.out.println("Tu letra es la W");
                break;
            case 3:
                System.out.println("Tu letra es la A");
                break;
            case 4:
                System.out.println("Tu letra es la G");
                break;
            case 5:
                System.out.println("Tu letra es la M");
                break;
            case 6:
                System.out.println("Tu letra es la Y");
                break;
            case 7:
                System.out.println("Tu letra es la F");
                break;
            case 8:
                System.out.println("Tu letra es la P");
                break;
            case 9:
                System.out.println("Tu letra es la D");
                break;
            case 10:
                System.out.println("Tu letra es la X");
                break;
            case 11:
                System.out.println("Tu letra es la B");
                break;
            case 12:
                System.out.println("Tu letra es la N");
                break;
            case 13:
                System.out.println("Tu letra es la J");
                break;
            case 14:
                System.out.println("Tu letra es la Z");
                break;
            case 15:
                System.out.println("Tu letra es la S");
                break;
            case 16:
                System.out.println("Tu letra es la Q");
                break;
            case 17:
                System.out.println("Tu letra es la V");
                break;
            case 18:
                System.out.println("Tu letra es la H");
                break;
            case 19:
                System.out.println("Tu letra es la L");
                break;
            case 20:
                System.out.println("Tu letra es la C");
                break;
            case 21:
                System.out.println("Tu letra es la K");
                break;
            case 22:
                System.out.println("Tu letra es la E");
                break;


            default:
                System.out.println("Facultad no valida");
                break;
        }
    }
}
