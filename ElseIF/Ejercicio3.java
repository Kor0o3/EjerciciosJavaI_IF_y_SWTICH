import javax.management.monitor.StringMonitor;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caracter;

        System.out.print("Ingresa un caracter: ");
        caracter = sc.nextLine();
        caracter = caracter.trim();

        if (Character.isUpperCase(caracter.charAt(0))) {
            System.out.println("El caracter es mayuscula");
        } else if (Character.isLowerCase(caracter.charAt(0))) {
            System.out.println("El caracter no es mayuscula");
        } else {
            System.out.println("Solo letras");
        }
    }
}
