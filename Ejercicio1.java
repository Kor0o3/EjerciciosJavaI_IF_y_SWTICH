import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caracteristicas;

        System.out.print("introduce una caracteristica para saber si es digno de levantar el Mjolnir: ");
        caracteristicas = sc.nextLine();

        if (caracteristicas.equalsIgnoreCase("digno")) {
            System.out.println("Es digno de levantar el Mjolnir");
        } else {
            System.out.println("No es digno de levantar el Mjolnir");
        }
    }
}