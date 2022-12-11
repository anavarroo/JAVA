import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce un numero: ");
        int n = sc.nextInt();

        String rojo = "\033[0;31m";
        String amarillo = "\033[0;33m";
        String reset = "\033[0m";

        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if (j==i ||j==0){
                    System.out.print(rojo + "*" + reset);

                } else if (j!=i){
                    System.out.print(amarillo + "*" + reset);
                }

            }
            System.out.println();
        }

        for (int i=n;i>=0;i--){
            for(int j=0;j<i+1;j++){
                if (j==i ||j==0){
                    System.out.print(rojo + "*" + reset);
                } else if (j!=i){
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();
        }


    }
}






