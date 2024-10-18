import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        float kg;

        System.out.print("Ingrese los kilogramos(kg): ");
        kg = sc.nextFloat();
        System.out.println("----------------------------------------------------------");
        System.out.println("Escoja la unidad a la que desea convertir los kilogramos: ");
        System.out.println("----------------------------------------------------------");
        System.out.println("1.- Hectogramos (hg) ");
        System.out.println("2.- Decagramos (dag) ");
        System.out.println("3.- Gramos (g)");
        System.out.println("4.- Decigramos (dg)");
        System.out.println("5.- Centigramos (cg)");
        System.out.println("6.- Milligramos (mg)");
        System.out.println("7.- Toneladas (T)");
        System.out.println("----------------------------------------------------------");
        System.out.print("Escoge una opcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Kilogramos a hectogramos: " + kg * 10);
                break;
            case 2:
                System.out.print("Kilogramos a decagramos: " + kg * 100);
                break;
            case 3:
                System.out.print("Kilogramos a gramos: " + kg * 1000);
                break;
            case 4:
                System.out.print("Kilogramos a decigramos: " + kg * 10000);
                break;
            case 5:
                System.out.print("Kilogramos a centigramos: " + kg * 100000);
                break;
            case 6:
                System.out.print("Kilogramos a milligramos: " + kg * 1000000);
                break;
            case 7:
                System.out.print("Kilogramos a toneladas: " + kg / 1000);
                break;
            default:
                System.out.println("Esa opcion no existe");
        }
    }
}