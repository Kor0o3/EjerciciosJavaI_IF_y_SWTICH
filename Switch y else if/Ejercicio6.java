import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio;

        System.out.print("Ingrese el importe de compra: ");
        precio = sc.nextInt();

        if (precio > 300) {
            System.out.println("Se va a aplicar un descuento de 20%");
            System.out.println("El importe de compra total es: " + precio * 0.80 +"$");
        } else {
            System.out.println("El importe de compra total es:  " + precio +"$");
        }
    }
}
