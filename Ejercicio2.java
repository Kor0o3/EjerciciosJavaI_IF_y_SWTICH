import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float energia;

        System.out.print("Ingresa el porcentaje de bateria del traje de Tony Stark: ");
        energia = sc.nextFloat();

        if (energia >= 20) {
            System.out.println("Tony puede usar el traje");
        } else {
            System.out.println("Tony no puede usar el bateria");
        }
    }
}
