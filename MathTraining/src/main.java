import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego para entrenar tu calculo mental!");

        String respuesta = "Si";

        int caciertos = 0;
        int aciertos = 0;
        int raciertos = 0;
        long tronda = 0;
        long ttotal = 0;
        long trecord = 0;


        do {
            System.out.println("¿Estas preparado para empezar? Responde con Si/No");
            respuesta = sc.next();


            for (int j = 0; j > -1; j++) {

                if (respuesta.equals("Si")) {

                    System.out.println("Empieza el juego...");

                    long startTime, endTime;
                    startTime = System.nanoTime();

                    int al1 = (int) (Math.random() * 101);
                    int al2 = (int) (Math.random() * 101);
                    int aloperacion = (int) (Math.random() * 5);
                    int resultado = 0;

                    int rsuma = 0;
                    if (aloperacion == 0) {
                        System.out.println("Cuanto es " + al1 + "+" + al2 + "?");
                        resultado = sc.nextInt();
                        rsuma = al1 + al2;

                        if (resultado == rsuma) {
                            System.out.println("Resultado correcto. Sigue asi!");
                            caciertos++;
                            endTime = System.nanoTime();
                            ttotal +=tronda;
                        } else if (resultado != rsuma) {

                            System.out.println("!Resultado incorrecto¡");
                            endTime = System.nanoTime();
                            tronda = (endTime - startTime)/1000000000;
                            ttotal +=tronda;
                            caciertos = aciertos;

                            if (aciertos>raciertos){
                                raciertos=aciertos;
                                trecord = ttotal;
                                System.out.println("Enhorabuena has conseguido el record de aciertos de la sesion¡");
                            } else if (aciertos<raciertos){
                                raciertos=raciertos;
                            }

                            System.out.println("El record de aciertos de la sesion es de " + raciertos + " aciertos, en un tiempo de " + trecord + " segundos");
                            System.out.println("Has conseguido " + aciertos + " aciertos");
                            System.out.println("Has tardado " + ttotal + " segundos hasta llegar al fallo");
                            caciertos = 0;
                            ttotal = 0;
                            break;
                        }
                    }

                    int rresta = 0;
                    if (aloperacion == 1) {
                        System.out.println("Cuanto es " + al1 + "-" + al2 + "?");
                        resultado = sc.nextInt();
                        rresta = al1 - al2;

                        if (resultado == rresta) {
                            System.out.println("Resultado correcto. Sigue asi!");
                            caciertos++;
                            endTime = System.nanoTime();
                            ttotal +=tronda;
                        } else if (resultado != rresta) {

                            System.out.println("!Resultado incorrecto¡");
                            endTime = System.nanoTime();
                            tronda = (endTime - startTime)/1000000000;
                            ttotal +=tronda;
                            caciertos = aciertos;

                            if (aciertos>raciertos){
                                raciertos=aciertos;
                                trecord = ttotal;
                                System.out.println("Enhorabuena has conseguido el record de aciertos de la sesion¡");
                            } else if (aciertos<raciertos){
                                raciertos=raciertos;
                            }

                            System.out.println("El record de aciertos de la sesion es de " + raciertos + " aciertos, en un tiempo de " + trecord + " segundos");
                            System.out.println("Has conseguido " + aciertos + " aciertos");
                            System.out.println("Has tardado " + ttotal + " segundos hasta llegar al fallo");
                            caciertos = 0;
                            ttotal = 0;
                            break;
                        }
                    }

                    int rmulti = 0;
                    if (aloperacion == 2) {
                        System.out.println("Cuanto es " + al1 + "*" + al2 + "?");
                        resultado = sc.nextInt();
                        rmulti = al1 * al2;

                        if (resultado == rmulti) {
                            System.out.println("Resultado correcto. Sigue asi!");
                            caciertos++;
                            endTime = System.nanoTime();
                            ttotal +=tronda;
                        } else if (resultado != rmulti) {
                            System.out.println("!Resultado incorrecto¡");
                            endTime = System.nanoTime();
                            tronda = (endTime - startTime)/1000000000;
                            ttotal +=tronda;
                            caciertos = aciertos;

                            if (aciertos>raciertos){
                                raciertos=aciertos;
                                trecord = ttotal;
                                System.out.println("Enhorabuena has conseguido el record de aciertos de la sesion¡");
                            } else if (aciertos<raciertos){
                                raciertos=raciertos;
                            }

                            System.out.println("El record de aciertos de la sesion es de " + raciertos + " aciertos, en un tiempo de " + trecord + " segundos");
                            System.out.println("Has conseguido " + aciertos + " aciertos");
                            System.out.println("Has tardado " + ttotal + " segundos hasta llegar al fallo");
                            caciertos = 0;
                            ttotal = 0;
                            break;
                        }
                    }

                    int rdiv = 0;
                    if (aloperacion == 3) {
                        System.out.println("Cuanto es " + al1 + "/" + al2 + "?");
                        resultado = sc.nextInt();
                        rdiv = al1 / al2;

                        if (resultado == rdiv) {
                            System.out.println("Resultado correcto. Sigue asi!");
                            caciertos++;
                            endTime = System.nanoTime();
                            ttotal +=tronda;
                        } else if (resultado != rdiv) {
                            System.out.println("!Resultado incorrecto¡");
                            endTime = System.nanoTime();
                            tronda = (endTime - startTime)/1000000000;
                            ttotal +=tronda;
                            caciertos = aciertos;

                            if (aciertos>raciertos){
                                raciertos=aciertos;
                                trecord = ttotal;
                                System.out.println("Enhorabuena has conseguido el record de aciertos de la sesion¡");
                            } else if (aciertos<raciertos){
                                raciertos=raciertos;
                            }

                            System.out.println("El record de aciertos de la sesion es de " + raciertos + " aciertos, en un tiempo de " + trecord + " segundos");
                            System.out.println("Has conseguido " + aciertos + " aciertos");
                            System.out.println("Has tardado " + ttotal + " segundos hasta llegar al fallo");
                            caciertos = 0;
                            ttotal = 0;
                            break;
                        }
                    }

                    int rresto = 0;
                    if (aloperacion == 4) {
                        System.out.println("Cuanto es el RESTO de " + al1 + "/" + al2 + "?");
                        resultado = sc.nextInt();
                        rresto = al1 % al2;

                        if (resultado == rresto) {
                            System.out.println("Resultado correcto. Sigue asi!");
                            caciertos++;
                            endTime = System.nanoTime();
                            ttotal +=tronda;
                        } else if (resultado != rresto) {
                            System.out.println("!Resultado incorrecto¡");
                            endTime = System.nanoTime();
                            tronda = (endTime - startTime)/1000000000;
                            ttotal +=tronda;
                            caciertos = aciertos;

                            if (aciertos>raciertos){
                                raciertos=aciertos;
                                trecord = ttotal;
                                System.out.println("Enhorabuena has conseguido el record de aciertos de la sesion¡");
                            } else if (aciertos<raciertos){
                                raciertos=raciertos;
                            }

                            System.out.println("El record de aciertos de la sesion es de " + raciertos + " aciertos, en un tiempo de " + trecord + " segundos");
                            System.out.println("Has conseguido " + aciertos + " aciertos");
                            System.out.println("Has tardado " + ttotal + " segundos hasta llegar al fallo");
                            caciertos = 0;
                            ttotal = 0;
                            break;
                        }
                    }

                    aciertos = caciertos;

                }

                if (respuesta.equals("No")) {
                    System.out.println("El record de aciertos seguidos en la sesion es de " + raciertos + " aciertos.");
                    System.out.println("El tiempo de duracion de la sesion ha sido de " + trecord + " segundos.");
                    System.out.println("!El juego ha finalizado¡");
                    break;
                }
            }

        } while (respuesta.equals("Si"));

    }
}
