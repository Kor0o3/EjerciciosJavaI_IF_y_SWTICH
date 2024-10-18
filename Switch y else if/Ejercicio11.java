import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cantidad;
        String monedas;

        System.out.println("Conversor de euros a libras, dolares, yenes y bolivares");
        System.out.print("Ingrese la cantidad de euros: ");
        cantidad = sc.nextFloat();

        System.out.print("Ingrese la moneda a la que quiere realizar: ");
        monedas = sc.next();
        sc.nextLine();

        if (monedas.equalsIgnoreCase("Libras")) {
            System.out.println("La cantidad en libras es "+ cantidad * 0.83);
        } else if (monedas.equalsIgnoreCase("Dolares")) {
            System.out.println("La cantidad en dolares es "+ cantidad * 1.08);
        } else if (monedas.equalsIgnoreCase("Yenes")) {
            System.out.println("La cantidad en yenes es "+ cantidad * 162.50);
        } else if (monedas.equalsIgnoreCase("Bolivares")) {
            System.out.println("La cantidad en bolivareses es "+ cantidad * 100000.00);
        } else {
            System.out.println("Lo siento no esta disponible esa moneda");
        }
    }
}
