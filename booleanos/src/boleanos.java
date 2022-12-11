import java.util.Scanner;

public class boleanos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vas a usar TODO el bote rojo?");
        boolean rojo = sc.nextBoolean();
        System.out.println("Vas a usar la mitad el bote rojo?");
        boolean mrojo = sc.nextBoolean();

        System.out.println("Vas a usar TODO el bote verde?");
        boolean verde = sc.nextBoolean();
        System.out.println("Vas a usar la mitad el bote verde?");
        boolean mverde = sc.nextBoolean();

        System.out.println("Vas a usar TODO el bote azul?");
        boolean azul = sc.nextBoolean();
        System.out.println("Vas a usar la mitad el bote azul?");
        boolean mazul = sc.nextBoolean();

        System.out.println("Primeros colores");

        System.out.println("Se pintará el color rojo?: " + (rojo && !verde && !azul));
        System.out.println("Se pintará el color Verde?: " + (!rojo && verde && !azul && !mrojo && !mverde && !mazul));
        System.out.println("Se pintará el color Azul?: " + (!rojo && !verde && azul  && !mrojo && !mverde && !mazul));
        System.out.println("No se pintara ningun color o negro?: " + (!rojo && !verde && !azul && !mrojo && !mverde && !mazul));
        System.out.println("Se pintará el color amarillo?: " + (rojo && verde && !azul  && !mrojo && !mverde && !mazul));
        System.out.println("Se pintará el color Fucsia?: " + (rojo && !verde && azul && !mrojo && !mverde && !mazul));
        System.out.println("Se pintará el color rojo?: " + (!rojo && verde && azul && !mrojo && !mverde && !mazul));
        System.out.println("Se pintará el color rojo?: " + (rojo && verde && azul && !mrojo && !mverde && !mazul));


        System.out.println("Segundos colores");

        System.out.println("Se pintará el color naranja?: " + (rojo && !verde && !azul && !mrojo && mverde && !mazul));
        System.out.println("Se pintará el color verde lima?: " + (!rojo && verde && !azul && mrojo && !mverde && !mazul));
        System.out.println("Se pintará el color rosa?: " + (rojo && !verde && !azul && !mrojo && !mverde && mazul));
        System.out.println("Se pintará el color morado?: " + (!rojo && !verde && azul && mrojo && !mverde && !mazul));
        System.out.println("Se pintará el color verde clarito?: " + (rojo && !verde && !azul && !mrojo && mverde && !mazul));
        System.out.println("Se pintará el color azul claro?: " + (!rojo && !verde && azul && !mrojo && mverde && !mazul));
        System.out.println("Se pintará el color granate?: " + (!rojo && !verde && !azul && mrojo && !mverde && !mazul));
        System.out.println("Se pintará el color verde oscuro?: " + (!rojo && !verde && !azul && !mrojo && mverde && !mazul));
        System.out.println("Se pintará el color azul marino?: " + (!rojo && !verde && !azul && !mrojo && !mverde && mazul));
        System.out.println("Se pintará el color Oro?: " + (!rojo && !verde && !azul && mrojo && mverde && !mazul));
        System.out.println("Se pintará el color Celeste oscuro?: " + (!rojo && !verde && !azul && !mrojo && mverde && mazul));
        System.out.println("Se pintará el color Morado oscuro?: " + (!rojo && !verde && !azul && mrojo && !mverde && mazul));
        System.out.println("Se pintará el color gris?: " + (!rojo && !verde && !azul && mrojo && mverde && mazul));
        System.out.println("Se pintará el color gris?: " + (mrojo && mverde && mazul));
        System.out.println("Color 1 " + (!rojo && !verde && azul && mrojo && mverde && !mazul));
        System.out.println("Color 2 " + (!rojo && verde && !azul && mrojo && !mverde && mazul));
        System.out.println("Color 3 " + (!rojo && verde && azul && mrojo && !mverde && !mazul));
        System.out.println("Color 4 " + (rojo && !verde && !azul && !mrojo && mverde && mazul));
        System.out.println("Color 5 " + (rojo && !verde && azul && !mrojo && mverde && !mazul));
        System.out.println("Color 6 " + (rojo && verde && !azul && !mrojo && !mverde && mazul));


        System.out.println("Terceros colores");
        System.out.println("Se pintará el color Verde o el color Azul?: " + (!rojo && verde && !azul && !mrojo && !mverde && !mazul || !rojo && !verde && azul  && !mrojo && !mverde && !mazul));
        System.out.println("Se pintará el color negro o (127, 255, 127?: " + (!rojo && !verde && !azul && !mrojo && !mverde && !mazul || !rojo && verde && !azul && mrojo && !mverde && mazul));



    }
}
