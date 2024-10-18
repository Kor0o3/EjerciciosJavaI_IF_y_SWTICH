import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Escribe un numero: ");
        n1 = sc.nextInt();
        System.out.print("Escribe otro numero: ");
        n2 = sc.nextInt();

        if (n1 % 2 == 0 && n2 % 2 == 0) {
            System.out.println("Ambos son pares");
        } else if (n1 % 2 != 0 && n2 % 2 != 0) {
            System.out.println("Ambos son impares");
        } else {
            System.out.println("Uno de los dos numeros no es par");
        }
    }
}
