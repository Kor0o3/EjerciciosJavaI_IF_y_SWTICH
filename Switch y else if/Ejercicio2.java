import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 +" es mayor que "+ n2);
        } else if (n1 < n2) {
            System.out.println(n2 +" es mayor que "+ n1);
        } else {
            System.out.println(n1 + " es igual que "+ n2);
        }
    }
}
