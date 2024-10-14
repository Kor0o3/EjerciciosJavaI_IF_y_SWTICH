import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adj1, adj2;

        System.out.print("Introduce una cuadilad del Capitan America: ");
        adj1 = sc.nextLine();
        System.out.print("Introduce otra: ");
        adj2 = sc.nextLine();

        if (adj1.equalsIgnoreCase("Honesto") && adj2.equalsIgnoreCase("Valiente")) {
            System.out.println("El Capitan america es apto de liderar los vengadores");
        } else {
            System.out.println("El Capitan america no es apto para liderar.");
        }
    }
}
