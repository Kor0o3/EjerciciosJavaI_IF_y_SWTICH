import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Cuantas horas has trabajado en total: ");
        hora = sc.nextInt();

        if (hora > 40) {
            System.out.println("Su paga con extras es de " + (40 * 16 + (hora - 40) * 20));
        } else {
            System.out.println("Su paga es de "+ hora * 16);
        }
    }
}
