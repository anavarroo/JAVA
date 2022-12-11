import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean fin=false;
        int iPos=1;
        int jPos=1;


        for (int i = 1;i<=20;i++){
            for (int j = 1;i<=20;j++){
                if (j == 1 || j == 20 || i == 1 || i == 20){
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }





        }

    }

