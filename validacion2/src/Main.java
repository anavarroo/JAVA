public class Main {
    public static void main(String[] args) {

        int n1=1;
        int n2=2;
        int n3=3;
        int n4=4;
        int n5=5;
        int n6=6;
        int n7=7;
        int n8=8;

        int obtencion1 = 11-((n1*4) + (n2*8) + (n3*5) + (n4*10) + (n5*9) + (n6*7) + (n7*3) + (n8*6))%11;

        if (obtencion1==10){
            obtencion1= 1;
            System.out.println("Numero de control 1: " + obtencion1);
        } else if (obtencion1 == 11){
            obtencion1 = 0;
            System.out.println("Numero de control 1: " + obtencion1);
        }
        else {
            System.out.println("Numero de control 1: " + obtencion1);
        }


        int ncuenta1 = 1;
        int ncuenta2 = 2;
        int ncuenta3 = 3;
        int ncuenta4 = 4;
        int ncuenta5 = 5;
        int ncuenta6 = 6;
        int ncuenta7 = 7;
        int ncuenta8 = 8;
        int ncuenta9 = 9;
        int ncuenta10 = 0;

        int obtenciond2 = 11-((ncuenta1 * 1) + (ncuenta2 * 2) + (ncuenta3 * 4) + (ncuenta4 * 8) + (ncuenta5 * 5) + (ncuenta6 * 10)+
                + (ncuenta7 * 9) + (ncuenta8 * 7) + (ncuenta9 * 3) + (ncuenta10 * 6))%11;


        if (obtenciond2 == 10){
            obtenciond2 = 1;
            System.out.println("Numero de control 2: " + obtenciond2);
        } else if (obtenciond2 == 11){
            obtenciond2 = 0;
            System.out.println("Numero de control 2: " + obtenciond2);
        }
        else {
            System.out.println("Numero de control 2: " + obtenciond2);
        }

    }
}
